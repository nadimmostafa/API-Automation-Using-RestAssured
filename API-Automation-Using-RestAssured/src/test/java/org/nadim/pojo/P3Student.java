package org.nadim.pojo;

import java.util.List;

public class P3Student {
	private int sId;
	private String sname;
	private String dept;
	private String gender;
	private String email;
	List<StudentAddress> addresses;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<StudentAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<StudentAddress> addresses) {
		this.addresses = addresses;
	}

	
}