package com.gvp.mall.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carrers")
public class CarrersDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="s_no")
	private Integer carId;
	@Column(name="reference_id",unique = true,nullable = false)
	private String refId;
	@Column(name="name_of_job")
	private String jobName;
	@Column(name="qualification")
	private String jobQualification;
	@Column(name="position")
	private String jobPosition;
	@Column(name="experience")
	private int jobExperience;
	private String jobType;
	@Column(name="location")
	private String jobLocation;
	@Column(name="expiry_date")
	private Date doe;
	
	public CarrersDTO() {
		super();
	}

	public CarrersDTO(String refId, String jobName, String jobQualification, String jobPosition,
			int jobExperience, String jobType, String jobLocation, Date doe) {
		super();
		//this.carId = carId;
		this.refId = refId;
		this.jobName = jobName;
		this.jobQualification = jobQualification;
		this.jobPosition = jobPosition;
		this.jobExperience = jobExperience;
		this.jobType = jobType;
		this.jobLocation = jobLocation;
		this.doe = doe;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobQualification() {
		return jobQualification;
	}

	public void setJobQualification(String jobQualification) {
		this.jobQualification = jobQualification;
	}

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}

	public int getJobExperience() {
		return jobExperience;
	}

	public void setJobExperience(int jobExperience) {
		this.jobExperience = jobExperience;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	@Override
	public String toString() {
		return "CarrersDTO [carId=" + carId + ", refId=" + refId + ", jobName=" + jobName + ", jobQualification="
				+ jobQualification + ", jobPosition=" + jobPosition + ", jobExperience=" + jobExperience + ", jobType="
				+ jobType + ", jobLocation=" + jobLocation + ", doe=" + doe + "]";
	}
	
}
