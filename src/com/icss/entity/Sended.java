package com.icss.entity;

import java.sql.Timestamp;

public class Sended {
	private Integer sendId;
	private Integer clientId;
	private String admin;
	private Integer buckets;
	private Timestamp  sendDate;
	public Integer getSendId() {
		return sendId;
	}
	public void setSendId(Integer sendId) {
		this.sendId = sendId;
	}
	public Integer getClientId() {
		return clientId;
	}
	public void setClientId(Integer clientId) {
		this.clientId = clientId;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public Integer getBuckets() {
		return buckets;
	}
	public void setBuckets(Integer buckets) {
		this.buckets = buckets;
	}
	public Timestamp getSendDate() {
		return sendDate;
	}
	public void setSendDate(Timestamp sendDate) {
		this.sendDate = sendDate;
	}
	@Override
	public String toString() {
		return "Sended [sendId=" + sendId + ", clientId=" + clientId + ", admin=" + admin + ", buckets=" + buckets
				+ ", sendDate=" + sendDate + "]";
	}

}
