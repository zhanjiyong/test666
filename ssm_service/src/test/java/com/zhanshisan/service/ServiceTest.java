package com.zhanshisan.service;


import com.zhanshisan.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class ServiceTest {
    @Autowired
    private ItemsService itemsService;

    @Test
    public void testService(){
        Items items = new Items();
        items.setName("华为手机");
        items.setPrice(8888f);
        items.setCreatetime(new Date());
        items.setPic("1.jpg");

        itemsService.save(items);

        List<Items> list = itemsService.findAll();
        System.out.println(list);
    }
}
