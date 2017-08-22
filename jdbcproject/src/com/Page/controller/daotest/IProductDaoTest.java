package com.Page.controller.daotest;


import com.Page.controller.PageResult.PageResult;
import com.Page.controller.dao.IProductDao;
import com.Page.controller.dao.impl.IProductDaoImpl;
import com.Page.controller.domain.Product;

import org.junit.Test;

import java.util.List;

public class IProductDaoTest {
    IProductDao dao = new IProductDaoImpl();
    @Test
    public void save() throws Exception {
        Product product = new Product();
        product.setProductName("逻辑M9");
        product.setDir_id(2L);
        product.setSalePrice(460.68);
        product.setSupplier("微软");
        product.setBrand("罗技");
        product.setCutoff(0.5);
        product.setCostPrice(40);
        dao.save(product);

    }

    @Test
    public void delete() throws Exception {
        dao.delete(5L);
    }

    @Test
    public void update() throws Exception {
        Product product = new Product();
        Long id = 3L;
        product.setSalePrice(700);
        product.setSupplier("双飞燕");
        dao.update(id,product);
    }

    @Test
    public void get() throws Exception {
        Product product = dao.get(1L);
        System.out.println(product);

    }

    @Test
    public void list() throws Exception {
        List<Product> list = dao.list();
        for(Product ele:list){
            System.out.println(ele);
        }
    }
    //-----------测试分页
    @Test
    public void testPage() throws Exception {
        PageResult pageResult = dao.queryPage(2, 3);
        for(Object ele:pageResult.getListData()){
            System.out.println(ele);
        }
        System.out.println("上一页="+pageResult.getPrePage());
        System.out.println("下一页="+pageResult.getNextPage());
        System.out.println("总页数="+pageResult.getTotalPage());
    }

}