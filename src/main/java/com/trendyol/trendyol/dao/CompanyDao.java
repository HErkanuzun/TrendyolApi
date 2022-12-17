package com.trendyol.trendyol.dao;

import com.trendyol.trendyol.dto.ICompanyRepository;
import com.trendyol.trendyol.entity.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CompanyDao {

    private ICompanyRepository companyRepository;

    public  CompanyDao(ICompanyRepository companyRepository)
    {
        this.companyRepository = companyRepository;
    }

    public CompanyDao()
    {

    }

    public void create(Company company)
    {
        companyRepository.save(company);
    }
    public void update(Company company)
    {
        companyRepository.save(company);
    }
    public void destroy(Company company)
    {
        companyRepository.save(company);
    }
    public String getCompanyById (Long id)
    {
        return "Company Silindi";
    }

    public List<Company> getAllCompany(){
        return companyRepository.findAll();
    }

}
