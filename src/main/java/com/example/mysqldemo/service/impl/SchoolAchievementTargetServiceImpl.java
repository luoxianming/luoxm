package com.example.mysqldemo.service.impl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.mysqldemo.bean.SchoolAchievementTarget;
import com.example.mysqldemo.dao.SchoolAchievementTargetDao;
import com.example.mysqldemo.excel.vo.SchoolAchievementTargetInput;
import com.example.mysqldemo.service.SchoolAchievementTargetService;
import com.example.mysqldemo.utils.ExcelUtils;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import javax.annotation.Resource;


/**
 *学校业绩目标 serverImpl
 */
@Slf4j
@Service
@Transactional
public class SchoolAchievementTargetServiceImpl   implements SchoolAchievementTargetService {

	/**
	 * 注入dao
	 */
	@Resource
	private SchoolAchievementTargetDao schoolAchievementTargetDao;

	@Override
	public SchoolAchievementTarget selectByPrimaryKey(Integer id) {
		SchoolAchievementTarget target = schoolAchievementTargetDao.selectByPrimaryKey(id);
		String filePath ="C:/Users/luoxianming/Desktop/新建文件夹/目标表/20200719 -sheet13.xlsx";
		List<SchoolAchievementTargetInput> batchLoad = ExcelUtils.readExcelObject(filePath, SchoolAchievementTargetInput.class);
		log.info("test{}", batchLoad.get(0));
		if (!batchLoad.isEmpty()) {
			for (SchoolAchievementTargetInput resource: batchLoad) {
				SchoolAchievementTarget target1 = new SchoolAchievementTarget();
				BeanUtils.copyProperties(resource, target1);
				schoolAchievementTargetDao.insert(target1);
			}
		}

		log.info("执行结束{}"+ "pk");
		return target;
	}

}
