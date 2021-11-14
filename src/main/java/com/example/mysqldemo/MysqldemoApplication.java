package com.example.mysqldemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.Resource;

import com.example.mysqldemo.excel.vo.Behavior;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mysqldemo.dao.SchoolAchievementTargetDao;
import com.example.mysqldemo.excel.vo.RankManageBatchInput;
import com.example.mysqldemo.excel.vo.SchoolAchievementTargetInput;
import com.example.mysqldemo.utils.ExcelUtils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author luoxianming
 */
@Slf4j
@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class MysqldemoApplication {

	@Resource
	private SchoolAchievementTargetDao schoolAchievementTargetDao;
	
	public static void main(String[] args) {
//		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();

//		String filePath ="C:/Users/luoxianming/Desktop/新建文件夹/目标表/20200719 - 1.xlsx";
//		List<SchoolAchievementTargetInput> batchLoad = ExcelUtils.readExcelObject(filePath, SchoolAchievementTargetInput.class);
//		log.info("test{}", batchLoad.get(0));
//		log.info("test{}", batchLoad);
//		String path = "C:/Users/luoxianming/Desktop/新建 XLSX 工作表 (2).xlsx";
//		List<Behavior> batchLoad = ExcelUtils.readExcelObject(path,Behavior.class);
//		log.info("test{}", batchLoad.get(0));
//		System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
		//SpringApplication.run(MysqldemoApplication.class, args);
//		{
//
//		}
//		byte[] placeholder = new byte[64 * 1024 * 1024];
//		placeholder = null;
//		System.gc();
		int[] arr = new int []{1,2,3,6,7,8};
//		for (int i= 1; i <100; i++){
//			arr[i] = i;
//		}

		System.out.println(binarySearch(arr, 8));
	}


	public static int binarySearch(int[] arr, int date){
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] < date) {
				low = mid + 1;
			}else if (arr[mid] == date) {
				return mid;
			}else {
				high = mid -1;
			}
		}

		return -1;
	}
}
