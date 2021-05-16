package com.zhanshisan.test;

import com.zhanshisan.dao.ItemsDao;
import com.zhanshisan.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
/*RunWith是spring用来打印日志的注解*/
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
/*之前是ClassPathXmlApplicationContext context =
new ClassPathXmlApplicationContext("applicationContext.xml");
来读取配置文件           然后调用反射获取对象再调用方法

现在的话直接打注解自动获取对象autoWrite但是需要使用ContextConfiguration来读取配置文件里面的内容
*/
public class DaoTest {

    @Autowired
    private ItemsDao itemsDao;

    @Test
    public void testDao(){
        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);

        List<Items> list = itemsDao.findAll();
        System.out.println(list);
    }
}
