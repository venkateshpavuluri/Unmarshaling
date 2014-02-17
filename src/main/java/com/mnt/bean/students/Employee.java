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
	@XmlElement
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
	@XmlElement
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
