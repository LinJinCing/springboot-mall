package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.madel.Product;

public interface ProductService {

    Product getProductById(int productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(int productId, ProductRequest productRequest);

}
