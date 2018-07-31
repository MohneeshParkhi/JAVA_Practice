package com.mohneesh.creationalPatterns.Protype;

public class Employee implements Prototype{

	private String name;
	private String orgName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public Employee(String name, String orgName) {
		super();
		this.name = name;
		this.orgName = orgName;
	}
	
	
	public void showRecord() {
		System.out.println("Employee Name :"+name);
		System.out.println("Organisation name :"+orgName);
	}
	
	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new Employee(name,orgName);
	}
	
	
	
}
