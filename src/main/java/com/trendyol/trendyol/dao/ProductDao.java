package com.trendyol.trendyol.dao;

import com.trendyol.trendyol.dto.IProductRepository;
import com.trendyol.trendyol.entity.Product;
import org.aspectj.util.PartialOrder;

import java.util.List;

public class ProductDao {

    private IProductRepository productRepository;

    public ProductDao(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDao() {

    }

    public void create(Product product) {
        productRepository.save(product);
    }

    public void update(Product product) {
        productRepository.save(product);
    }

    public String getPropertyById(Long id)
    {
        return "Property Silindi";
    }
    public List<Product> getAllProduct()
    {
        return productRepository.findAll();
    }
}
