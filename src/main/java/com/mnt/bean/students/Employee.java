/**
 * 
 */
package com.mnt.bean.students;

import com.sun.xml.txw2.annotation.XmlElement;

/**
 * @author Nag
 *
 */
public class Employee {
	private String empName;
	private String empId;
	/**
	 * @return the empName
	 */
	@javax.xml.bind.annotation.XmlElement(name="empName",namespace="http://mnt.com/bean/students")
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the empId
	 */
	@javax.xml.bind.annotation.XmlElement(name="empId",namespace="http://mnt.com/bean/students")
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	

}
