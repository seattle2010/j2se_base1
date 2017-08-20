package com.AdvancedDAO.product.dao;

import com.AdvancedDAO.product.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductDao {
    List<Product> list();

    /**
     *
     * @param name 商品的名称模糊查询 productName LIKE '%name%'
     * @param minSalePrice 查询商品零售价大于等于最低价格 salePrice >= minSalePrice
     * @param maxSalePrice
     * @return
     */
    List<Product> query(String name, BigDecimal minSalePrice,BigDecimal maxSalePrice);

}
