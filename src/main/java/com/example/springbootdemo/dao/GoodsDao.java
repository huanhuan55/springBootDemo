package com.example.springbootdemo.dao;

import com.example.springbootdemo.bean.Goods;

import java.util.HashMap;
import java.util.Map;
/**
 * ClassName: GoodsDao
 * Package: com.example.springbootdemo.dao
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 11:35
 * @Version 1.0
 */
public interface GoodsDao {
    Goods getGoods(String code);
}
