package com.example.springbootdemo.Service;

import com.example.springbootdemo.bean.Goods;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: GoodsService
 * Package: com.example.springbootdemo.Service
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 11:45
 * @Version 1.0
 */
public interface GoodsService {

    /**
     * 抽象方法
     * @return   商品集合
     */
    Goods getGoods(String code);

}
