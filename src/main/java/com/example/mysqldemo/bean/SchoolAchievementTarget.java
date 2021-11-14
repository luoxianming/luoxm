package com.example.mysqldemo.bean;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.math.BigDecimal;



/**
 *学校业绩目标 bean
 */
@Data
@NoArgsConstructor
public class SchoolAchievementTarget{


	/**
	 * id
	 */
	private Integer id;
	/**
	 * 学院
	 */
	private String college;
	/**
	 * 项目
	 */
	private String projectName;
	/**
	 * 片区
	 */
	private String area;
	/**
	 * 大片区
	 */
	private String bigArea;
	/**
	 * 学校
	 */
	private String school;
	/**
	 * 校区
	 */
	private String schoolArea;
	/**
	 * 一月
	 */
	private Integer targetJan;
	/**
	 * 二月
	 */
	private Integer targetFeb;
	/**
	 * 三月
	 */
	private Integer targetMar;
	/**
	 * 四月
	 */
	private Integer targetApr;
	/**
	 * 五月
	 */
	private Integer targetMay;
	/**
	 * 六月
	 */
	private Integer targetJun;
	/**
	 * 七月
	 */
	private Integer targetJul;
	/**
	 * 八月
	 */
	private Integer targetAug;
	/**
	 * 九月
	 */
	private Integer targetSept;
	/**
	 * 十月
	 */
	private Integer targetOct;
	/**
	 * 十一月
	 */
	private Integer targetNov;
	/**
	 * 十二月
	 */
	private Integer targetDec;
	/**
	 * 年目标
	 */
	private Integer targetYearValue;
	/**
	 * 年
	 */
	private Integer targetYear;
	/**
	 * created_time
	 */
	private Date createdTime;
	/**
	 * updated_time
	 */
	private Date updatedTime;
	
}
