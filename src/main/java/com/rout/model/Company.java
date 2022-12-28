package com.rout.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long companyId;
	private String companyName;
	private LocalDateTime companyCreatedDate;
	private Long emplStrength;
	private Long departmentStrength;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public LocalDateTime getCompanyCreatedDate() {
		return companyCreatedDate;
	}

	public void setCompanyCreatedDate(LocalDateTime companyCreatedDate) {
		this.companyCreatedDate = companyCreatedDate;
	}

	public Long getEmplStrength() {
		return emplStrength;
	}

	public void setEmplStrength(Long emplStrength) {
		this.emplStrength = emplStrength;
	}

	public Long getDepartmentStrength() {
		return departmentStrength;
	}

	public void setDepartmentStrength(Long departmentStrength) {
		this.departmentStrength = departmentStrength;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyCreatedDate="
				+ companyCreatedDate + ", emplStrength=" + emplStrength + ", departmentStrength=" + departmentStrength
				+ "]";
	}

}
