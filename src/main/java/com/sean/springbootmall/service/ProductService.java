package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.madel.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(int productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(int productId, ProductRequest productRequest);

    void deleteProductById(int productId);
}
