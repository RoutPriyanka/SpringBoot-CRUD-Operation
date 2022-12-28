package com.rout.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rout.model.Company;
import com.rout.repository.CompanyRepository;

@Service
public class CompanyService {

	@Autowired
	private CompanyRepository companyRepo;

	public Company saveCompanyData(Company company) {
		return companyRepo.save(company);
	}

	public List<Company> saveListCompany(List<Company> comapny) {
		return companyRepo.saveAll(comapny);
	}

	public List<Company> getAllComanyData() {
		return companyRepo.findAll();
	}
	
	public Company findById(Long companyId) {
		return companyRepo.findById(companyId).get();
	}
	
	public Company updateCompany(Company company) {
		return companyRepo.save(company);
	} 

	public String delete(Long companyId) {
		 companyRepo.deleteById(companyId);
		 return "delte suscefully";
	}

}
