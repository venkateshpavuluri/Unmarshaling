/**
 * 
 */
package com.mnt.model;

import java.io.File;
import java.net.URI;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.mnt.bean.students.Employee;
import com.mnt.bean.students.Student;

/**
 * @author Nag
 *
 */
public class StudentsDetails {
	public static void main(String[] args)throws Exception {
		 JAXBContext jc = JAXBContext.newInstance(Student.class);
         Unmarshaller u = jc.createUnmarshaller();
         
         File fs=new File("D:\\git\\UnMarshaling\\src\\main\\webapp\\student.xml");
         Student io=(Student)u.unmarshal(fs);
         System.out.println(io.getName()+"=="+io.getPassId()+"=="+io.getPassword()+"=="+io.getUserId());
/*List<Employee> employee=(List<Employee>)io.getEmployees();
System.out.println("employees size iss=="+employee.size());*/

	}

}
