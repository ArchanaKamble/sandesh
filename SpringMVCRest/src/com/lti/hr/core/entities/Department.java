package com.lti.hr.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//Entity whih can be used for query also
@Entity
@Table(name="DEPARTMENTS")
public class Department {
	
	@Id
	@Column(name="DEPARTMENT_ID")
	private int deptNo;
	
	@Column(name="DEPARTMENT_NAME")
	private String deptNm;
	
	@Column(name="LOCATION_ID")
	private int locId;
	
	public Department() {
		super();
	}
	public Department(int deptNo, String deptNm, int locId) {
		super();
		this.deptNo = deptNo;
		this.deptNm = deptNm;
		this.locId = locId;
	}
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptNm() {
		return deptNm;
	}
	public void setDeptNm(String deptNm) {
		this.deptNm = deptNm;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptNm=" + deptNm + ", locId=" + locId + "]";
	}
	
	
}
