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
@XmlRootElement
public class Student {
	private String name;
	private String password;
	private String userId;
	private String passId;
	private List<Employee> employees;
	/**
	 * @return the employees
	 */
	@XmlElement
	public List<Employee> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	/**
	 * @return the passId
	 */
	@XmlElement
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
	@XmlElement
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
	@XmlElement
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
	@XmlElement
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
