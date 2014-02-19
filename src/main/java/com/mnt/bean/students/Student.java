/**
 * 
 */
package com.mnt.bean.students;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * @author Nag
 *
 */
@XmlRootElement(name="student",namespace="http://mnt.com/bean/students")
public class Student {
	private String name;
	private String password;
	private String userId;
	private String passId;
	
private List<Employee> employes;

@javax.xml.bind.annotation.XmlElement(name="employes",namespace="http://mnt.com/bean/students")
	public List<Employee> getEmployes() {
	return employes;
}
public void setEmployes(List<Employee> employes) {
	this.employes = employes;
}
	/**
	 * @return the passId
	 */
	@javax.xml.bind.annotation.XmlElement(name="passId",namespace="http://mnt.com/bean/students")
	public String getPassId() {
		return passId;
	}
	/**
	 * @param passId the passId to set
	 */
	public void setPassId(String passId) {
		this.passId = passId;
	}
	/**
	 * @return the userId
	 */
	@javax.xml.bind.annotation.XmlElement(name="userId",namespace="http://mnt.com/bean/students")
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the name
	 */
	@javax.xml.bind.annotation.XmlElement(name="name",namespace="http://mnt.com/bean/students")
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	@javax.xml.bind.annotation.XmlElement(name="password",namespace="http://mnt.com/bean/students")
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	

}
