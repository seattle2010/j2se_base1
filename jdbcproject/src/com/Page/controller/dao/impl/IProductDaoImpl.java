package com.Page.controller.dao.impl;

import com.Page.controller.dao.IProductDao;
import com.Page.controller.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class IProductDaoImpl implements IProductDao {
    @Override
    public List<Product> list() {
        List<Product> list = new ArrayList<>();

        return list;
    }
}
