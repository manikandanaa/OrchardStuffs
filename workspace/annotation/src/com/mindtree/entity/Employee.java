package com.mindtree.entity;

import java.util.Date;


@Table(name="EMP")
public class Employee 
{
	private int employeeid;
	private String employeename;
	private Date hiredate;
	
	public Employee(int employeeid,String employeename,Date hiredate)
	{
		super();
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.hiredate=hiredate;
	}
	
	@Id
	@Column(name="EMP_ID",type="NUMBER(5)")
	public int getEmployeeid() {
		return employeeid;
	}
	@Id
	@Column(name="EMP_ID",type="NUMBER(5)")
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	@Column(name="EMP_NAME",type="")
	public String getEmployeename() {
		return employeename;
	}
	@Column(name="EMP_NAME",type="")
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	@Column(name="HIRE_DATE",type="DATE")
	public Date getHiredate() {
		return hiredate;
	}
	@Column(name="HIRE_DATE",type="DATE")
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	
}
