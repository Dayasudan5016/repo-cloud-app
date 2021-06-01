package com.cloudapp.entity;

public class TollGateDetails {
	
	private int id;
	private String fromPlace;
	private String toPlace;
	private int noOfTolls;
	private String citiesCrossingBy;
	private int avgRate;
	private String approval;
	
	public TollGateDetails() {
		super();
	}
	
	public TollGateDetails(int id, String fromPlace, String toPlace, int noOfTolls, String citiesCrossingBy, int avgRate, String approval) {
		super();
		this.id = id;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.noOfTolls = noOfTolls;
		this.citiesCrossingBy = citiesCrossingBy;
		this.avgRate = avgRate;
		this.approval = approval;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public int getnoOfTolls() {
		return noOfTolls;
	}
	public void setnoOfTolls(int noOfTolls) {
		this.noOfTolls = noOfTolls;
	}
	public String getCitiesCrossingBy() {
		return citiesCrossingBy;
	}
	public void setCitiesCrossingBy(String citiesCrossingBy) {
		this.citiesCrossingBy = citiesCrossingBy;
	}
	public int getavgRate() {
		return avgRate;
	}
	public void setavgRate(int avgRate) {
		this.avgRate = avgRate;
	}
	public String getApproval() {
		return approval;
	}
	public void setApproval(String approval) {
		this.approval = approval;
	}
	
	@Override
	public String toString() {
		return "TollGateDetails [id=" + id + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", noOfTolls="+ noOfTolls + ", citiesCrossingBy=" + citiesCrossingBy + ", avgRate=" + avgRate + ", approval=" + approval+ "]";
	}
}