package com.trendyol.trendyol.dao;

import com.trendyol.trendyol.dto.IBrandRepository;
import com.trendyol.trendyol.entity.Brand;

import java.util.List;

public class BrandDao {
    private IBrandRepository brandRepository;
    public BrandDao(IBrandRepository brandRepository)
    {
        this.brandRepository = brandRepository;
    }
    public BrandDao(){}

    public void create(Brand brand){
        brandRepository.save(brand);
    }

    public void update(Brand brand){
        brandRepository.save(brand);
    }


    public void destroy(Long id){
        brandRepository.deleteById(id);
    }

    public String getBrandById(Long id){
        return "Brand Silindi";
    }

    public List<Brand> getAllBrand(){
        return brandRepository.findAll();
    }

}
