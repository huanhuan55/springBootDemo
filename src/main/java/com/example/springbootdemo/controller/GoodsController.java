package com.example.springbootdemo.controller;

import com.example.springbootdemo.Service.GoodsService;
import com.example.springbootdemo.Service.ServiceImpl.GoodsServiceImpl;
import com.example.springbootdemo.bean.Goods;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * ClassName: HelloController
 * Package: com.example.springbootdemo.controller
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 11:05
 * @Version 1.0
 */
@RestController
public class GoodsController {

    private GoodsService goodsService = new GoodsServiceImpl();

    //注解
    @GetMapping("/getGoods")
    public HashMap<String, Goods> getGoods(String code){
        //先将前台传递过来的条形码数据输出
        System.out.println("要查询的商品条形码是:"  + code);
        //根据code值查询商品
        Goods goods = goodsService.getGoods(code);
        HashMap<String, Goods> map= new HashMap<>();
        //如果查询不到商品，返回404
        if(goods == null){
            map.put("resultQuery",null);
            return map;
        }
        //查询到商品，返回商品即可
        map.put("resultQuery",goods);
        System.out.println("查询到的商品是:" + map);
        return map ;
    }
}
