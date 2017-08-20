package com.Page.controller;

import com.Page.controller.domain.Product;
import org.junit.Test;

import java.util.List;

//分页测试
public class PageTest {
    //控制台版本
    @Test
    public void test() throws Exception {
        //用户传入的
        Integer currentPage = 1;
        Integer pageSize = 10;
//                                      beginIndex,pageSize
        //查结果集 SELECT * FROM 表名 LIMIT ?,?
        String baseSql = "SELECT * FROM product LIMIT ?,?";
        List<Product> productList = JDBCTemplate.query(baseSql, (currentPage - 1) * pageSize, pageSize);
        //查询结果总数
        String countSql = "SELECT COUNT(*) FROM product";
        Long queryCount = JDBCTemplateCount.query(countSql);
        Integer totalCount = queryCount.intValue();
        System.out.println(totalCount);


        for(Product ele:productList){
            System.out.println(ele);
        }

    }
}
