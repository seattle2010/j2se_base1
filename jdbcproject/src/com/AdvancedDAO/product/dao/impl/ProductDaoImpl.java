package com.AdvancedDAO.product.dao.impl;

import com.AdvancedDAO.product.dao.IProductDao;
import com.AdvancedDAO.product.domain.Product;

import java.math.BigDecimal;
import java.util.List;

public class ProductDaoImpl implements IProductDao{
//    private  IResultSetHanlder rsh = new ProductResultSetHanlder();
//    //处理结果集，把结果集中的每一行封装成某一对象
//    class ProductResultSetHanlder implements IResultSetHandler<List<Product>> {
//        private IProductDirDAO dirDAO = new ProductDirDAOImpl();
//        //缓存商品的分类对象
//        //key:商品分类的id
//        //value：商品分类对象
//        private Map<Long, ProductDir> cache = new HashMap<>();
//        public List<Product> handle(ResuletSet rs)throws SQLException {
//            List<Product> list = new ArrayList<>();
//            while (rs.next()) {
//                Product p = new Product();
//                list.add(p);
//                p.setId(rs.getLong("id"));
//                p.setProductName(rs.getString("productName"));
//                p.setBrand(rs.getString("brand"));
//
//            }
//        }



    @Override
    public List<Product> list() {
        String sql = "SELECT * FROM product";
        return list();
    }

    @Override
    public List<Product> query(String name, BigDecimal minSalePrice, BigDecimal maxSalePrice) {
        return null;
    }
}
