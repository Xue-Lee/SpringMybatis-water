package com.icss.entity;

import java.sql.Timestamp;

public class Client {
	private Integer clientId;
	private String clientName;
	private String tel;
	private String address;
	private Float foregift;
	private Integer bucketCnt;
	private Timestamp  startDate;
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Float getForegift() {
		return foregift;
	}
	public void setForegift(Float foregift) {
		this.foregift = foregift;
	}
	public Integer getBucketCnt() {
		return bucketCnt;
	}
	public void setBucketCnt(Integer bucketCnt) {
		this.bucketCnt = bucketCnt;
	}
	public Timestamp getStartDate() {
		return startDate;
	}
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", tel=" + tel + ", address=" + address
				+ ", foregift=" + foregift + ", bucketCnt=" + bucketCnt + ", startDate=" + startDate + "]";
	}
	
	

}
