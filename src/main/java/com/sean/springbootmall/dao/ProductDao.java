package com.sean.springbootmall.dao;

import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.madel.Product;

public interface ProductDao {

    Product getProductById(int productId);

    int createProduct(ProductRequest productRequest);
}
