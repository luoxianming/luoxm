package com.example.mysqldemo.excel.vo;

import java.util.Date;

import com.example.mysqldemo.utils.ExcelAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SchoolAchievementTargetInput {

	/**
	 * 学院
	 */
	@ExcelAnnotation(columnIndex = 0)
	private String college;
	/**
	 * 项目
	 */
	@ExcelAnnotation(columnIndex = 1)
	private String projectName;
	/**
	 * 片区
	 */
	@ExcelAnnotation(columnIndex = 2)
	private String area;
	/**
	 * 大片区
	 */
	@ExcelAnnotation(columnIndex = 3)
	private String bigArea;
	/**
	 * 学校
	 */
	@ExcelAnnotation(columnIndex = 4)
	private String school;
	/**
	 * 校区
	 */
	@ExcelAnnotation(columnIndex = 5)
	private String schoolArea;
	/**
	 * 一月
	 */
	@ExcelAnnotation(columnIndex = 6)
	private Integer targetJan;
	/**
	 * 二月
	 */
	@ExcelAnnotation(columnIndex = 7)
	private Integer targetFeb;
	/**
	 * 三月
	 */
	@ExcelAnnotation(columnIndex = 8)
	private Integer targetMar;
	/**
	 * 四月
	 */
	@ExcelAnnotation(columnIndex = 10)
	private Integer targetApr;
	/**
	 * 五月
	 */
	@ExcelAnnotation(columnIndex = 11)
	private Integer targetMay;
	/**
	 * 六月
	 */
	@ExcelAnnotation(columnIndex = 12)
	private Integer targetJun;
	/**
	 * 七月
	 */
	@ExcelAnnotation(columnIndex = 13)
	private Integer targetJul;
	/**
	 * 八月
	 */
	@ExcelAnnotation(columnIndex = 14)
	private Integer targetAug;
	/**
	 * 九月
	 */
	@ExcelAnnotation(columnIndex = 15)
	private Integer targetSept;
	/**
	 * 十月
	 */
	@ExcelAnnotation(columnIndex = 16)
	private Integer targetOct;
	/**
	 * 十一月
	 */
	@ExcelAnnotation(columnIndex = 16)
	private Integer targetNov;
	/**
	 * 十二月
	 */
	@ExcelAnnotation(columnIndex = 17)
	private Integer targetDec;
	/**
	 * 年目标
	 */
	@ExcelAnnotation(columnIndex = 18)
	private Integer targetYearValue;
	/**
	 * 年
	 */
	@ExcelAnnotation(columnIndex = 19)
	private Integer targetYear;
}
