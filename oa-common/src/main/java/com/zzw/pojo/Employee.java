package com.zzw.pojo;

import java.util.Date;

public class Employee {
	private Integer empno;
	private String empname;
	private Integer empsex;
	private Date hiredate;
	private Integer sal;

	public Integer getEmpno() {
		return empno;
	}

	public String getEmpname() {
		return empname;
	}

	public Integer getEmpsex() {
		return empsex;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public Integer getSal() {
		return sal;
	}

	public void setEmpno(Integer empno) {
		this.empno = empno;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public void setEmpsex(Integer empsex) {
		this.empsex = empsex;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}
}
