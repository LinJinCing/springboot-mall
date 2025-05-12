package com.sean.springbootmall.service.impl;

import com.sean.springbootmall.dao.ProductDao;
import com.sean.springbootmall.madel.Product;
import com.sean.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }
}
