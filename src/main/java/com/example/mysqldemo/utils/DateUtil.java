package com.example.mysqldemo.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description 时间与日期相互转换
 * @author yuchunping
 * @date 2019年3月25日 上午11:12:33
 */
public class DateUtil {

	   private static final String FORMAT_YMD= "yyyy-MM-dd HH:mm:ss";
	
	   /** 
	     * 时间戳转换成日期格式字符串 
	     * @param seconds 精确到秒的字符串 ：注意这里的seconds必须是13位的（像这样：1558508994204）
	     */  
	    public static String timeStamp2Date(String seconds,String format) {  
	        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){  
	            return "";  
	        }  
	        if(format == null || format.isEmpty()){
	            format = FORMAT_YMD;
	        }   
	        SimpleDateFormat sdf = new SimpleDateFormat(format);  
	        return sdf.format(new Date(Long.valueOf(seconds)));  
	    }  
	    /** 
	     * 日期格式字符串转换成时间戳 
	     * @param date_str 字符串日期 
	     */  
	    public static String date2TimeStamp(String date_str,String format){  
	        try {  
	            SimpleDateFormat sdf = new SimpleDateFormat(format);  
	            return String.valueOf(sdf.parse(date_str).getTime()/1000);  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	        return "";  
	    }  
	    /** 
	     * 取得当前时间戳（精确到秒） 
	     * @return 
	     */  
	    public static String timeStamp(){  
	        long time = System.currentTimeMillis();
	        String t = String.valueOf(time/1000);  
	        return t;  
	    }  
	    
	    /**
	     * @Description 获取YMD格式的日期
	     * @author yuchunping
	     * @param dateString
	     * @return
	     * @throws ParseException
	     */
	    public static Date getStringToDateYMD(String dateString) throws ParseException {
	    	try {
				if (StringUtils.isBlank(dateString)) {
					return null;
				}
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date date = sdf.parse(dateString);
				return date;
			}catch (Exception exception){

			}
			return new Date();
		}
	    
	    
	    public static void main(String[] args) {  
	        String timeStamp = timeStamp();  
	        System.out.println("timeStamp="+timeStamp); 
	        System.out.println(System.currentTimeMillis());
	        //该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数

	       String date = timeStamp2Date(timeStamp, "yyyy-MM-dd HH:mm:ss");  
	       System.out.println("date="+date);
	       String timeStamp2 = date2TimeStamp(date, "yyyy-MM-dd HH:mm:ss");  
	        System.out.println(timeStamp2); 
	    }
}
