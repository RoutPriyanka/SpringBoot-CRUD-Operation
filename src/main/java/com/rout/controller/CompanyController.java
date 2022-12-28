package com.rout.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rout.model.Company;
import com.rout.service.CompanyService;

@RestController
@RequestMapping("/companies")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@PostMapping
	public Company saveOneComapnyData(@RequestBody Company company) {
		return companyService.saveCompanyData(company);
	}

	@PostMapping("/saveAll")
	public List<Company> saveAllCompany(@RequestBody List<Company> company) {
		return companyService.saveListCompany(company);
	}

	@GetMapping("/getAll")
	public List<Company> getAll() {
		return companyService.getAllComanyData();
	}

	@GetMapping("/{companyId}")
	public Company findByComapnyId(@PathVariable Long companyId) {
		return companyService.findById(companyId);
	}
	
	@PutMapping("/update")
	public Company updateComapny(@RequestBody Company company) {
		return companyService.updateCompany(company);
	}
	
	@DeleteMapping("/delete/{companyId}")
	public String deletecomapnyById(@PathVariable Long companyId) {
		return companyService.delete(companyId);
	}

}
