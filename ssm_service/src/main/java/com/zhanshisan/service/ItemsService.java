package com.zhanshisan.service;

import com.zhanshisan.pojo.Items;

import java.util.List;

public interface ItemsService {
    /***
     * 列表查询
     * @return
     */
    List<Items> findAll();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);
}
