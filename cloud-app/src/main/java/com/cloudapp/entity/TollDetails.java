package com.cloudapp.entity;

public class TollDetails {

	private int tollId;
	private String highwayCity;
	private int noOfLanes;
	private int classALaneNo; //total no of Class A lanes
	private String classALaneVehicles;
	private int classBLaneNo; //total no of Class B lanes
	private String classBLaneVehicles;
	private int classCLaneNo; //total no of Class C lanes
	private String classCLaneVehicles;
	private int classDLaneNo; //total no of Class D lanes
	private String classDLaneVehicles;
	private String approval;
	
	public TollDetails() {
		super();
	}

	public int getTollId() {
		return tollId;
	}

	public void setTollId(int tollId) {
		this.tollId = tollId;
	}

	public String getHighwayCity() {
		return highwayCity;
	}

	public void setHighwayCity(String highwayCity) {
		this.highwayCity = highwayCity;
	}

	public int getNoOfLanes() {
		return noOfLanes;
	}

	public void setNoOfLanes(int noOfLanes) {
		this.noOfLanes = noOfLanes;
	}

	public int getClassALaneNo() {
		return classALaneNo;
	}

	public void setClassALaneNo(int classALaneNo) {
		this.classALaneNo = classALaneNo;
	}

	public String getClassALaneVehicles() {
		return classALaneVehicles;
	}

	public void setClassALaneVehicles(String classALaneVehicles) {
		this.classALaneVehicles = classALaneVehicles;
	}

	public int getClassBLaneNo() {
		return classBLaneNo;
	}

	public void setClassBLaneNo(int classBLaneNo) {
		this.classBLaneNo = classBLaneNo;
	}

	public String getClassBLaneVehicles() {
		return classBLaneVehicles;
	}

	public void setClassBLaneVehicles(String classBLaneVehicles) {
		this.classBLaneVehicles = classBLaneVehicles;
	}

	public int getClassCLaneNo() {
		return classCLaneNo;
	}

	public void setClassCLaneNo(int classCLaneNo) {
		this.classCLaneNo = classCLaneNo;
	}

	public String getClassCLaneVehicles() {
		return classCLaneVehicles;
	}

	public void setClassCLaneVehicles(String classCLaneVehicles) {
		this.classCLaneVehicles = classCLaneVehicles;
	}

	public int getClassDLaneNo() {
		return classDLaneNo;
	}

	public void setClassDLaneNo(int classDLaneNo) {
		this.classDLaneNo = classDLaneNo;
	}

	public String getClassDLaneVehicles() {
		return classDLaneVehicles;
	}

	public void setClassDLaneVehicles(String classDLaneVehicles) {
		this.classDLaneVehicles = classDLaneVehicles;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "TollDetails [tollId=" + tollId + ", highwayCity=" + highwayCity + ", noOfLanes=" + noOfLanes
				+ ", classALaneNo=" + classALaneNo + ", classALaneVehicles=" + classALaneVehicles + ", classBLaneNo="
				+ classBLaneNo + ", classBLaneVehicles=" + classBLaneVehicles + ", classCLaneNo=" + classCLaneNo
				+ ", classCLaneVehicles=" + classCLaneVehicles + ", classDLaneNo=" + classDLaneNo
				+ ", classDLaneVehicles=" + classDLaneVehicles + ", approval=" + approval + "]";
	}
}