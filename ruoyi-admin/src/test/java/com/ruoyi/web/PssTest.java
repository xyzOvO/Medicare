package com.ruoyi.web;

import com.ruoyi.common.utils.uuid.IdUtils;
import com.ruoyi.common.utils.uuid.UUID;
import com.ruoyi.pill.domain.PillDrug;
import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.service.IPillDrugService;
import com.ruoyi.pill.service.IPillFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/7 13:38
 */

//@SpringBootTest
public class PssTest {
    @Autowired
    private IPillFactoryService pillFactoryService;

    @Autowired
    private IPillDrugService iPillDrugService;

    @Test
    public void testSelect() {
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("云南");
//        pillFactory.setFactoryId(101L);
        System.out.println(pillFactoryService.selectPillFactoryList(pillFactory));
    }

    @Test
    public void testSelectDrug() {
        PillDrug pillDrug = new PillDrug();
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("哈药");
        pillDrug.setPillFactory(pillFactory);
        List<PillDrug> pillDrugs = iPillDrugService.selectPillDrugList(pillDrug);
        System.out.println(pillDrugs);
    }

    @Test
    public void cs1() {
        // 测试雪花ID
//        System.out.println(UUID.randomUUID());
//        System.out.println(UUID.fastUUID());
        System.out.println(UUID.nameUUIDFromBytes("123".getBytes()));
    }

    @Test
    public void cs2() {
        // 测试ID生成工具类
        long l = System.currentTimeMillis();// 起始毫秒数
        System.out.println(IdUtils.randomUUID());
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }

    @Test
    public void cs3() {
        // 去除"-"符号
        long l = System.currentTimeMillis();// 起始毫秒数
        System.out.println(IdUtils.simpleUUID());
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }

    @Test
    public void cs4() {
        long l = System.currentTimeMillis();// 起始毫秒数
        // 性能更好的单独线程生成ID，去除"-"符号
        System.out.println(IdUtils.fastSimpleUUID());
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }  
    @Test
    public void cs5() {
        long l = System.currentTimeMillis();// 起始毫秒数
        // 性能更好的单独线程生成ID
        System.out.println(IdUtils.fastUUID());
        long end = System.currentTimeMillis();
        System.out.println(end - l);
    }
    @Test
    public void cs6() {
        ThreadLocalRandom current = ThreadLocalRandom.current();// 获得随机数生成器，线程安全且性能高效
        int i = current.nextInt(100);
        System.out.println(i);
    }
    

}
