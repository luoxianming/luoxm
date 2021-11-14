package com.example.mysqldemo.service.impl;

import com.example.mysqldemo.bean.UserBehavior;
import com.example.mysqldemo.config.RedisConfig;
import com.example.mysqldemo.dao.BehaviorDao;
import com.example.mysqldemo.excel.vo.Behavior;
import com.example.mysqldemo.service.BehaviorService;
import com.example.mysqldemo.service.redis.RedisService;
import com.example.mysqldemo.utils.ExcelUtils;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: luoxianming
 * @Date: 2020/8/27 21:19
 */
@Slf4j
@Service
public class BehaviorServiceInpl implements BehaviorService {

    @Resource
    BehaviorDao behaviorDao;

    @Resource
    private RedisService redisService;

    @Override
    public void insert() {

        boolean setIfAbsent = redisService.setIfAbsent("test","1",60);

        if (!setIfAbsent){
            System.out.println("重复请求");
            throw new RuntimeException();
        }

        try {
            //Thread.sleep(70000L);
        }catch (Exception e){
            System.out.println("1");
        }finally {
            redisService.removeWithPrefix("test");
        }

//        String path = "C:/Users/luoxianming/Desktop/新建 XLSX 工作表 (2).xlsx";
//        List<Behavior> batchLoad = ExcelUtils.readExcelObject(path,Behavior.class);
//        Map<String, List<Behavior>> map = batchLoad.stream().collect(Collectors.groupingBy(Behavior::getFirst));
//        Date date = new Date();
//        for (Map.Entry<String, List<Behavior>> entry: map.entrySet()){
//            UserBehavior userBehavior = new UserBehavior();
//            userBehavior.setBehaviorName(entry.getKey());
//            userBehavior.setDeleted(false);
//            userBehavior.setHasChild(true);
//            userBehavior.setCreatedAt(date);
//            userBehavior.setUpdatedAt(date);
//            userBehavior.setParentId(0);
//            userBehavior.setFullName(userBehavior.getBehaviorName());
//
//
//            int id = behaviorDao.insert(userBehavior);
//            Integer parentId = userBehavior.getId();
//            behaviorDao.update(userBehavior.getId(), userBehavior.getId(), userBehavior.getId().toString());
//            log.info("保存结果 ->{}", userBehavior );
//
//            for (Behavior item : entry.getValue()){
//                UserBehavior userBehavior1 = new UserBehavior();
//                userBehavior1.setBehaviorName(item.getSecond());
//                userBehavior1.setDeleted(false);
//                userBehavior1.setHasChild(false);
//                userBehavior1.setCreatedAt(date);
//                userBehavior1.setUpdatedAt(date);
//                userBehavior1.setParentId(parentId);
//                userBehavior1.setFullName(entry.getKey() +"."+userBehavior1.getBehaviorName());
//
//                behaviorDao.insert(userBehavior1);
//                behaviorDao.update(userBehavior1.getId(), userBehavior1.getId(), userBehavior.getId().toString()+"/"+userBehavior1.getId());
//            }
//        }
//        log.info("test{}", batchLoad.get(0));
    }
}
