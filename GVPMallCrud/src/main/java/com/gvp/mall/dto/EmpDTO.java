package com.gvp.mall.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEES")
public class EmpDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;// Primary Key

	@Column(name = "EMP_NO", unique = true, nullable = false)
	private String empNo;

	@Column(name = "FIRST_NAME", nullable = false)
	private String empFirstName;
	
	@Column(name = "LAST_NAME")
	private String empLastName;
	
	@Column(name = "GENDER")
	private char gender;
	
	@Column(name = "DOB")
	private String DOB;
	
	@Column(name = "QUALIFICATION")
	private String empQualification;
	
	@Column(name = "DEPARTMENT")
	private String empDept;
	
	@Column(name = "JOB_ROLE")
	private String empRole;
	
	@Column(name = "JOB_LEVEL")
	private String empJobLevel;
	
	@Column(name = "EXPERIENCE")
	private double empExp;
	
	@Column(name = "JOINING_DATE",nullable = false)
	private String empJD;
	
	@Column(name = "JOB_TYPE")
	private String empType;
	
	@Column(name = "SALARY",nullable = false)
	private double empSal;
	
	@Column(name = "EPF_ACCOUNT",nullable = false)
	private boolean epfAccount;
	
	@Column(name = "LOCATION")
	private String empLocation;
	
	@Column(name = "STATUS",nullable = false)
	private String empStatus;

	public EmpDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmpDTO(String empNo, String empFirstName, String empLastName, char gender, String dOB,
			String empQualification, String empDept, String empRole, String empJobLevel, double empExp, String empJD,
			String empType, double empSal, boolean epfAccount, String empLocation, String empStatus) {
		super();

		this.empNo = empNo;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.gender = gender;
		DOB = dOB;
		this.empQualification = empQualification;
		this.empDept = empDept;
		this.empRole = empRole;
		this.empJobLevel = empJobLevel;
		this.empExp = empExp;
		this.empJD = empJD;
		this.empType = empType;
		this.empSal = empSal;
		this.epfAccount = epfAccount;
		this.empLocation = empLocation;
		this.empStatus = empStatus;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getEmpQualification() {
		return empQualification;
	}

	public void setEmpQualification(String empQualification) {
		this.empQualification = empQualification;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String getEmpJobLevel() {
		return empJobLevel;
	}

	public void setEmpJobLevel(String empJobLevel) {
		this.empJobLevel = empJobLevel;
	}

	public double getEmpExp() {
		return empExp;
	}

	public void setEmpExp(double empExp) {
		this.empExp = empExp;
	}

	public String getEmpJD() {
		return empJD;
	}

	public void setEmpJD(String empJD) {
		this.empJD = empJD;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	public boolean isEpfAccount() {
		return epfAccount;
	}

	public void setEpfAccount(boolean epfAccount) {
		this.epfAccount = epfAccount;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	@Override
	public String toString() {
		return "EmpDTO [empId=" + empId + ", empNo=" + empNo + ", empFirstName=" + empFirstName + ", empLastName="
				+ empLastName + ", gender=" + gender + ", DOB=" + DOB + ", empQualification=" + empQualification
				+ ", empDept=" + empDept + ", empRole=" + empRole + ", empJobLevel=" + empJobLevel + ", empExp="
				+ empExp + ", empJD=" + empJD + ", empType=" + empType + ", empSal=" + empSal + ", epfAccount="
				+ epfAccount + ", empLocation=" + empLocation + ", empStatus=" + empStatus + "]";
	}

}
