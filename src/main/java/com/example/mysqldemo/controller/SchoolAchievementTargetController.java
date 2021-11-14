package com.example.mysqldemo.controller;
import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysqldemo.bean.SchoolAchievementTarget;
import com.example.mysqldemo.service.SchoolAchievementTargetService;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *学校业绩目标 controller
 * @author luoxianming
 */
@Slf4j
@RequestMapping("/schoolAchievementTarget")
@RestController
public class SchoolAchievementTargetController  {


	@Resource
	private SchoolAchievementTargetService schoolAchievementTargetService;
//	/**
//	 * 跳转到列表页面
//	 */
//	@RequestMapping("schoolAchievementTarget/gotoList")
//	public String gotoList(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		return "simple/School_Achievement_Target_list";
//	}


	/**
	 * 跳转到详情页面
	 */
	@GetMapping(value= "/byId")
	public SchoolAchievementTarget gotoDetail(Integer id){
		log.info("test{}"+id);
		if(id!=null){
			SchoolAchievementTarget target = schoolAchievementTargetService.selectByPrimaryKey(id);
			return target;
		}
		
		return null;

	}


//	/**
//	 * 删除-学校业绩目标
//	 */
//	@ResponseBody
//	@RequestMapping("schoolAchievementTarget/deleteByPrimaryKey")
//	public DataRes deleteByPrimaryKey(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		return DataRes.success(schoolAchievementTargetService.deleteByPrimaryKey(schoolAchievementTarget));
//	}


	/**
	 *  保存 (主键为空则增加否则修改)-> 学校业绩目标
	 */
//	@ResponseBody
//	@RequestMapping("schoolAchievementTarget/save")
//	public DataRes save(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		if(schoolAchievementTarget.getId()==null){
//			return DataRes.success(schoolAchievementTargetService.insert(schoolAchievementTarget));
//		}
//		return DataRes.success(schoolAchievementTargetService.update(schoolAchievementTarget));
//
//	}


//	/**
//	 * 根据主键查询->学校业绩目标
//	 */
//	@ResponseBody
//	@RequestMapping("schoolAchievementTarget/selectByPrimaryKey")
//	public DataRes selectByPrimaryKey(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		return DataRes.success(schoolAchievementTargetService.selectByPrimaryKey(schoolAchievementTarget));
//	}


//	/**
//	 * 根据条件查询(所有的实体属性都是条件,如果为空则忽略该字段)->学校业绩目标
//	 */
//	@ResponseBody
//	@RequestMapping("schoolAchievementTarget/selectByCondition")
//	public DataRes selectByCondition(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		return DataRes.success(schoolAchievementTargetService.selectByCondition(schoolAchievementTarget));
//	}


//	/**
//	 * 分页查询 (所有的实体属性都是条件,如果为空则忽略该字段) (详见Page类.所以的实体都继承该类 默认 page=1 pageSize=10)->学校业绩目标
//	 */
//	@ResponseBody
//	@RequestMapping("schoolAchievementTarget/selectAllByPaging")
//	public DataRes selectAllByPaging(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		return DataRes.success(schoolAchievementTargetService.selectAllByPaging(schoolAchievementTarget));
//	}


//	/**
//	 * 导出报表->学校业绩目标
//	 */
//	@RequestMapping("schoolAchievementTarget/export")
//	public void export(SchoolAchievementTarget schoolAchievementTarget,HttpServletRequest request,HttpServletResponse response){
//		List<SchoolAchievementTarget> list= schoolAchievementTargetService.selectAll(schoolAchievementTarget);
//		Map<String, String> header = new LinkedHashMap<>();
//		header.put("id", "id");
//		header.put("college", "学院");
//		header.put("projectName", "项目");
//		header.put("area", "片区");
//		header.put("bigArea", "大片区");
//		header.put("school", "学校");
//		header.put("schoolArea", "校区");
//		header.put("targetJan", "一月");
//		header.put("targetFeb", "二月");
//		header.put("targetMar", "三月");
//		header.put("targetApr", "四月");
//		header.put("targetMay", "五月");
//		header.put("targetJun", "六月");
//		header.put("targetJul", "七月");
//		header.put("targetAug", "八月");
//		header.put("targetSept", "九月");
//		header.put("targetOct", "十月");
//		header.put("targetNov", "十一月");
//		header.put("targetDec", "十二月");
//		header.put("targetYearValue", "年目标");
//		header.put("targetYear", "年");
//		header.put("createdTime_", "created_time");
//		header.put("updatedTime_", "updated_time");
//		ExcelUtils.exportExcel("学校业绩目标",header,list,response,request);

//	}


}
