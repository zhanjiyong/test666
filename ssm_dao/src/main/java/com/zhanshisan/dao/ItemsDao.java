package com.zhanshisan.dao;

import com.zhanshisan.pojo.Items;

import java.util.List;

public interface ItemsDao {
    /**
     * 查询所有操作
     * @return
     */
    List<Items> findAll();

    /**
     * 保存的操作，需要传入Items对象
     * @param items
     * @return
     */
    int save(Items items);
}
