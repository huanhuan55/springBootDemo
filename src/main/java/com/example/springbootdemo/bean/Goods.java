package com.example.springbootdemo.bean;

import lombok.Data;
/**
 * ClassName: goods
 * Package: com.example.springbootdemo.bean
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 17:04
 * @Version 1.0
 */
@Data
public class Goods {
    private String name;
    private double price;
    private int count;

    public Goods() {
    }

    public Goods(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }
}
