package com.Page.controller.dao.impl;


import com.Page.controller.JDBCTemplate;
import com.Page.controller.JDBCTemplateCount;
import com.Page.controller.PageResult.PageResult;
import com.Page.controller.dao.IProductDao;
import com.Page.controller.domain.Product;

import java.util.List;

public class IProductDaoImpl implements IProductDao {

    @Override
    public void save(Product product) {
        String sql = "INSERT INTO product(productName,dir_id,salePrice,supplier,brand,cutoff,costPrice) VALUES (?,?,?,?,?,?,?)";
        JDBCTemplate.update(sql, product.getProductName(),product.getDir_id(),product.getSalePrice(),
                product.getSupplier(),product.getBrand(),product.getCutoff(),product.getCostPrice());
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM t_student WHERE id = ?";
        JDBCTemplate.update(sql, id);

    }

    @Override
    public void update(Long id, Product product) {

    }

    @Override
    public Product get(Long id) {
        return null;
    }

    @Override
    public List<Product> list() {
        return null;
    }
    //--------------分页操作--------------
    @Override
    public PageResult queryPage(Integer currentPage, Integer pageSize) {
        //查询结果集
        String baseSql = "SELECT * FROM product LIMIT ?,?";
        List<Product> listData = JDBCTemplate.query(baseSql, (currentPage - 1) * pageSize, pageSize);
        //查询结果总数
        String countSql = "SELECT COUNT(*) FROM product";
        Integer totalCount = JDBCTemplateCount.query(countSql);
        return new PageResult(listData,totalCount,currentPage,pageSize);
    }


}

