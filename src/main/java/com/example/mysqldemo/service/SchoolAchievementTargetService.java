package com.example.mysqldemo.service;

import com.example.mysqldemo.bean.SchoolAchievementTarget;

/**
 *学校业绩目标 service
 */
public interface SchoolAchievementTargetService{


	SchoolAchievementTarget selectByPrimaryKey(Integer id);
}
