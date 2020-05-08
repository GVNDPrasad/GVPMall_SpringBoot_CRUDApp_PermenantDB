package com.gvp.mall.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket_counters")
public class TicketCountersDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer counterNo;
	
	@Column(unique = true,nullable = false)
	private String counterCode;
	
	@Column(unique = true,nullable = false)
	private String counterName;
	@Column(name="counter_type")
	private String counterType;
	private Date counterOpsDate;
	@Column(name="counter_status")
	private String counterStatus;
	@Column(unique = true,nullable = false)
	private String counterMailId;
	
	@Column(name="counter_Manager")
	private String counterManager;
	
	//Default Constructor
	public TicketCountersDTO() {
		System.out.println("Ticket Counters Domain");
	}
	
	//Parameterized Constructor
	public TicketCountersDTO(int counterNo,String counterCode, String counterName, String counterType, Date counterOpsDate,
			String counterStatus, String counterMailId, String counterManager) {
		super();
		this.counterNo = counterNo;
		this.counterCode = counterCode;
		this.counterName = counterName;
		this.counterType = counterType;
		this.counterOpsDate = counterOpsDate;
		this.counterStatus = counterStatus;
		this.counterMailId = counterMailId;
		this.counterManager = counterManager;
	}
	
	//Setter Methods
	public void setCounterNo(int counterNo) {
		this.counterNo = counterNo;
	}
    public void setCounterCode(String counterCode) {
		this.counterCode = counterCode;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public void setCounterType(String counterType) {
		this.counterType = counterType;
	}

	public void setCounterOpsDate(Date counterOpsDate) {
		this.counterOpsDate = counterOpsDate;
	}

	public void setCounterStatus(String counterStatus) {
		this.counterStatus = counterStatus;
	}

	public void setCounterMailId(String counterMailId) {
		this.counterMailId = counterMailId;
	}

	public void setCounterManager(String counterManager) {
		this.counterManager = counterManager;
	}

	//Getter Methods
	public Integer getCounterNo() {
		return counterNo;
	}
	
	public String getCounterCode() {
		return counterCode;
	}

	public String getCounterName() {
		return counterName;
	}

	public String getCounterType() {
		return counterType;
	}

	public Date getCounterOpsDate() {
		return counterOpsDate;
	}

	public String getCounterStatus() {
		return counterStatus;
	}

	public String getCounterMailId() {
		return counterMailId;
	}

	public String getCounterManager() {
		return counterManager;
	}

	//toString()
	@Override
	public String toString() {
		return "TicketCountersDTO [counterNo=" + counterNo + ", counterCode=" + counterCode + ", counterName="
				+ counterName + ", counterType=" + counterType + ", counterOpsDate=" + counterOpsDate
				+ ", counterStatus=" + counterStatus + ", counterMailId=" + counterMailId + ", counterManager="
				+ counterManager + "]";
	}

}
