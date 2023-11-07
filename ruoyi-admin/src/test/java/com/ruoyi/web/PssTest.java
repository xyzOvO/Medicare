package com.ruoyi.web;

import com.ruoyi.pill.domain.PillDrug;
import com.ruoyi.pill.domain.PillFactory;
import com.ruoyi.pill.service.IPillDrugService;
import com.ruoyi.pill.service.IPillFactoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author xyz66 Email:2910223554@qq.com
 * @date 2023/11/7 13:38
 */

@SpringBootTest
public class PssTest {
    @Autowired
    private IPillFactoryService pillFactoryService;

    @Autowired
    private  IPillDrugService iPillDrugService;

    @Test
    public void testSelect(){
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("云南");
//        pillFactory.setFactoryId(101L);
        System.out.println(pillFactoryService.selectPillFactoryList(pillFactory));
    }

    @Test
    public void testSelectDrug(){
        PillDrug pillDrug = new PillDrug();
        PillFactory pillFactory = new PillFactory();
        pillFactory.setFactoryName("哈药");
        pillDrug.setPillFactory(pillFactory);
        List<PillDrug> pillDrugs = iPillDrugService.selectPillDrugList(pillDrug);
        System.out.println(pillDrugs);
    }

}
