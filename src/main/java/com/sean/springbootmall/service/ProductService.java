package com.sean.springbootmall.service;

import com.sean.springbootmall.dto.ProductQueryParams;
import com.sean.springbootmall.dto.ProductRequest;
import com.sean.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    int countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(int productId);

    int createProduct(ProductRequest productRequest);

    void updateProduct(int productId, ProductRequest productRequest);

    void deleteProductById(int productId);
}
