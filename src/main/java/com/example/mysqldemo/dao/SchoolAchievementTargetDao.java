package com.example.mysqldemo.dao;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import com.example.mysqldemo.bean.SchoolAchievementTarget;

/**
 *学校业绩目标 dao
 */
@Mapper
public interface SchoolAchievementTargetDao {

	@Select("select\n" + 
			"		id,\n" + 
			"		college,\n" + 
			"		project_name,\n" + 
			"		area,\n" + 
			"		big_area,\n" + 
			"		school,\n" + 
			"		school_area,\n" + 
			"		target_jan,\n" + 
			"		target_feb,\n" + 
			"		target_mar,\n" + 
			"		target_apr,\n" + 
			"		target_may,\n" + 
			"		target_jun,\n" + 
			"		target_jul,\n" + 
			"		target_aug,\n" + 
			"		target_sept,\n" + 
			"		target_oct,\n" + 
			"		target_nov,\n" + 
			"		target_dec,\n" + 
			"		target_year_value,\n" + 
			"		target_year,\n" + 
			"		created_time,\n" + 
			"		updated_time\n" + 
			"		from School_Achievement_Target\n" + 
			"		where id = #{id,jdbcType=INTEGER}")
	SchoolAchievementTarget selectByPrimaryKey(Integer id);
	
	@Insert("insert into School_Achievement_Target (\n" + 
			"		college,\n" + 
			"		project_name,\n" + 
			"		area,\n" + 
			"		big_area,\n" + 
			"		school,\n" + 
			"		school_area,\n" + 
			"		target_jan,\n" + 
			"		target_feb,\n" + 
			"		target_mar,\n" + 
			"		target_apr,\n" + 
			"		target_may,\n" + 
			"		target_jun,\n" + 
			"		target_jul,\n" + 
			"		target_aug,\n" + 
			"		target_sept,\n" + 
			"		target_oct,\n" + 
			"		target_nov,\n" + 
			"		target_dec,\n" + 
			"		target_year_value,\n" + 
			"		target_year\n" + 
			"		)\n" + 
			" 	   values (\n" + 
			"		 #{college,jdbcType=VARCHAR},\n" + 
			"		 #{projectName,jdbcType=VARCHAR},\n" + 
			"		 #{area,jdbcType=VARCHAR},\n" + 
			"		 #{bigArea,jdbcType=VARCHAR},\n" + 
			"		 #{school,jdbcType=VARCHAR},\n" + 
			"		 #{schoolArea,jdbcType=VARCHAR},\n" + 
			"		 #{targetJan,jdbcType=INTEGER},\n" + 
			"		 #{targetFeb,jdbcType=INTEGER},\n" + 
			"		 #{targetMar,jdbcType=INTEGER},\n" + 
			"		 #{targetApr,jdbcType=INTEGER},\n" + 
			"		 #{targetMay,jdbcType=INTEGER},\n" + 
			"		 #{targetJun,jdbcType=INTEGER},\n" + 
			"		 #{targetJul,jdbcType=INTEGER},\n" + 
			"		 #{targetAug,jdbcType=INTEGER},\n" + 
			"		 #{targetSept,jdbcType=INTEGER},\n" + 
			"		 #{targetOct,jdbcType=INTEGER},\n" + 
			"		 #{targetNov,jdbcType=INTEGER},\n" + 
			"		 #{targetDec,jdbcType=INTEGER},\n" + 
			"		 #{targetYearValue,jdbcType=INTEGER},\n" + 
			"		 #{targetYear,jdbcType=INTEGER})")
	int insert(SchoolAchievementTarget target);
}
