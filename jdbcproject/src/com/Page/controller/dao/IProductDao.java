package com.Page.controller.dao;

import com.Page.controller.PageResult.PageResult;
import com.Page.controller.domain.Product;

import java.util.List;

public interface IProductDao {


    public void save(Product product);

    public void delete(Long id);

    public void update(Long id,Product product);

    public Product get(Long id);

    public List<Product> list();
    /**
     *
     * @param currentPage 当前第几页
     * @param pageSize  每页最多显示多少条数据
     * @return 封装好结果集和
     */
    PageResult queryPage(Integer currentPage, Integer pageSize);

}
