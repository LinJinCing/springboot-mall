package com.sean.springbootmall.dao;

import com.sean.springbootmall.constant.ProductCategory;
import com.sean.springbootmall.dto.ProductQueryParams;
import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.madel.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(int productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(int productId, ProductRequest productRequest);

    void deleteProductById(int productId);
}
