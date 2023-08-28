package com.example.springbootdemo.Service.ServiceImpl;

import com.example.springbootdemo.Service.GoodsService;
import com.example.springbootdemo.bean.Goods;
import com.example.springbootdemo.dao.GoodsDao;
import com.example.springbootdemo.dao.daoImpl.GoodsDaoImpl;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: GoodsServiceImpl
 * Package: com.example.springbootdemo.Service.ServiceImpl
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 11:47
 * @Version 1.0
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    //多态
    private GoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public Goods getGoods(String code) {

        return  goodsDao.getGoods(code);
    }
}
