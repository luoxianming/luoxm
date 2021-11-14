package com.example.mysqldemo.utils;

//import com.gaodun.solon.common.exception.RankManageResultCode;
//import com.gaodun.solon.common.exception.ServiceException;
import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Slf4j
public class ExcelUtils {
  /**
   * 读取excel反射实体
   *
   * @param file  MultipartFile
   * @param clazz entity
   * @return
   * @throws RuntimeException
   */
  public static <T extends Object> List<T> readExcelObject(String filePath, Class<T> clazz) {



    // 存储excel数据
    List<T> list = new ArrayList<>();
    Workbook wookbook = null;
    InputStream inputStream = null;
	try {
		inputStream = new FileInputStream(filePath);
	} catch (FileNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}

    // 根据excel文件版本获取工作簿
    if (filePath.endsWith(".xls")) {
      wookbook = xls(inputStream);
    } else if (filePath.endsWith(".xlsx")) {
 
    	wookbook= xlsx(inputStream);
    } else {
      throw new RuntimeException("非excel文件");
    }

    // 得到一个工作表
    Sheet sheet = wookbook.getSheetAt(0);

    // 获取行总数
    int rows = sheet.getLastRowNum() + 1;
    Row row;

    // 获取类所有属性
    Field[] fields = clazz.getDeclaredFields();

    T obj = null;
    int coumnIndex = 0;
    Cell cell = null;
    ExcelAnnotation excelAnnotation = null;
    for (int i = 1; i < rows; i++) {
      // 获取excel行
      row = sheet.getRow(i);
      if (null == row) {
        continue;
      }
      //此处用来过滤空行
      Cell cell0 = row.getCell(0);
      Cell cell1 = row.getCell(1);
      if (null != cell0) {
        cell0.setCellType(CellType.STRING);
      }
      if (null != cell1) {
        cell1.setCellType(CellType.STRING);
      }
      if ((null == cell0 || StringUtils.isBlank(cell0.getStringCellValue())) &&
              (null == cell1 || StringUtils.isBlank(cell1.getStringCellValue()))) {
        continue;
      }
      try {
        // 创建实体
        obj = clazz.newInstance();
        for (Field f : fields) {
          // 设置属性可访问
          f.setAccessible(true);
          // 判断是否是注解
          if (f.isAnnotationPresent(ExcelAnnotation.class)) {
            // 获取注解
            excelAnnotation = f.getAnnotation(ExcelAnnotation.class);
            // 获取列索引
            coumnIndex = excelAnnotation.columnIndex();
            // 获取单元格
            cell = row.getCell(coumnIndex);
            if (null != cell) {
              // 设置属性
              setFieldValue(obj, f, wookbook, cell);
            }
          }
        }
        // 添加到集合中
        list.add(obj);
      } catch (InstantiationException e1) {
        e1.printStackTrace();
      } catch (IllegalAccessException e1) {
        e1.printStackTrace();
      } catch (Exception e) {
        e.printStackTrace();
//        throw new ServiceException(RankManageResultCode.FILE_CONTENT_ERROR.getMessage());
        throw new RuntimeException("excel文件内容出错");
      }
    }
    try {
      //释放资源
      wookbook.close();
      inputStream.close();
    } catch (IOException e) {
      log.error("", e);
      e.printStackTrace();
    }
    return list;
  }

  /**
   * 绑定实体值
   *
   * @param obj      Object
   * @param f        Field
   * @param wookbook Workbook
   * @param cell     Cell
   * @return
   * @throws RuntimeException
   */
  private static void setFieldValue(Object obj, Field f, Workbook wookbook, Cell cell) {
    try {

      cell.setCellType(CellType.STRING);
      if (StringUtils.isBlank(cell.getStringCellValue()) || "null".equals(cell.getStringCellValue()) || ObjectUtils.isEmpty(cell.getStringCellValue())) {
        f.set(obj, null);
      } else {
        if (f.getType() == byte.class || f.getType() == Byte.class) {

          f.set(obj, Byte.parseByte(cell.getStringCellValue().trim()));

        } else if (f.getType() == int.class || f.getType() == Integer.class) {

          f.set(obj, Integer.parseInt(cell.getStringCellValue().trim()));

        } else if (f.getType() == Double.class || f.getType() == double.class) {

          f.set(obj, Double.parseDouble(cell.getStringCellValue().trim()));

        } else if (f.getType() == BigDecimal.class) {

          f.set(obj, new BigDecimal(cell.getStringCellValue().trim()));

        } else {

          f.set(obj, cell.getStringCellValue().trim());

        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e.getLocalizedMessage());
    }
  }

  /**
   * 对excel 2003处理
   */
  private static Workbook xls(InputStream is) {
    try {
      // 得到工作簿
      return new HSSFWorkbook(is);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 对excel 2007处理
   */
  private static Workbook xlsx(InputStream is) {
    try {
      // 得到工作簿
      return new XSSFWorkbook(is);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void writeExcel(List<Map> dataList, int cloumnCount,String finalXlsxPath){
    OutputStream out = null;
    try {
      // 获取总列数
      int columnNumCount = cloumnCount;
      // 读取Excel文档
      File finalXlsxFile = new File(finalXlsxPath);
      Workbook workBook = getWorkbok(finalXlsxFile);
      // sheet 对应一个工作页
      Sheet sheet = workBook.getSheetAt(0);
      /**
       * 删除原有数据，除了属性列
       */
      int rowNumber = sheet.getLastRowNum();    // 第一行从0开始算
      System.out.println("原始数据总行数，除属性列：" + rowNumber);
      for (int i = 1; i <= rowNumber; i++) {
        Row row = sheet.getRow(i);
        sheet.removeRow(row);
      }
      // 创建文件输出流，输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
      out =  new FileOutputStream(finalXlsxPath);
      workBook.write(out);
      /**
       * 往Excel中写新数据
       */
      for (int j = 0; j < dataList.size(); j++) {
        // 创建一行：从第二行开始，跳过属性列
        Row row = sheet.createRow(j + 1);
        // 得到要插入的每一条记录
        Map dataMap = dataList.get(j);
        String name = dataMap.get("BankName").toString();
        String address = dataMap.get("Addr").toString();
        String phone = dataMap.get("Phone").toString();
        for (int k = 0; k <= columnNumCount; k++) {
          // 在一行内循环
          Cell first = row.createCell(0);
          first.setCellValue(name);

          Cell second = row.createCell(1);
          second.setCellValue(address);

          Cell third = row.createCell(2);
          third.setCellValue(phone);
        }
      }
      // 创建文件输出流，准备输出电子表格：这个必须有，否则你在sheet上做的任何操作都不会有效
      out =  new FileOutputStream(finalXlsxPath);
      workBook.write(out);
    } catch (Exception e) {
      e.printStackTrace();
    } finally{
      try {
        if(out != null){
          out.flush();
          out.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println("数据导出成功");
  }

  private static final String EXCEL_XLS = "xls";
  private static final String EXCEL_XLSX = "xlsx";

  /**
   * 判断Excel的版本,获取Workbook
   * @param in
   * @param filename
   * @return
   * @throws IOException
   */
  public static Workbook getWorkbok(File file) throws IOException{
    Workbook wb = null;
    FileInputStream in = new FileInputStream(file);
    if(file.getName().endsWith(EXCEL_XLS)){     //Excel&nbsp;2003
      wb = new HSSFWorkbook(in);
    }else if(file.getName().endsWith(EXCEL_XLSX)){    // Excel 2007/2010
      wb = new XSSFWorkbook(in);
    }
    return wb;
  }
}