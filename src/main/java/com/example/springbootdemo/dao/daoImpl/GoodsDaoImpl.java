package com.example.springbootdemo.dao.daoImpl;

import com.example.springbootdemo.dao.GoodsDao;
import com.example.springbootdemo.bean.Goods;

import java.util.HashMap;

/**
 * ClassName: GoodsDaoImpl
 * Package: com.example.springbootdemo.dao.daoImpl
 * Description:
 *
 * @Author czp
 * @Create 2023/6/30 11:44
 * @Version 1.0
 */
public class GoodsDaoImpl implements GoodsDao {

    /*
    goods 这个map集合充当的角色是数据库，里面已经存放好了 商品信息。
    做法就是 前台扫码枪，扫到条形码之后，对应的商品信息，显示到页面
     */
    public static  HashMap<String , Goods> goods = new HashMap();
    //静态代码块，项目运行的时候，先让这个goods有初始值
    static{
        goods.put("6900067161086",new Goods("可口可乐",3.9,1) );
        goods.put("1001",new Goods("水浒传",9.9,1) );
        goods.put("1002",new Goods("三国演义",9.9,1) );
        goods.put("1003",new Goods("红楼梦",9.9,1) );
        goods.put("1004",new Goods("西游记",9.9,1) );
    }


    /**
     *  查询商品的方法
     * @param code
     * @return
     *
     *   返回值是 map集合
     *      key : 表示状态码   404        200
     *      value :          null       商品
     */
    @Override
    public Goods getGoods(String code) {
        /*
         Dao层实现类 返回真是数据
         */
        // 创建一个map集合， 将code 对应的商品取出来，返回给页面
        Goods getGoodsByKey = goods.get(code);

        return getGoodsByKey;
    }
}
