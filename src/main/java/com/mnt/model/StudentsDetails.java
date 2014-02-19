/**
 * 
 */
package com.mnt.model;

import java.io.File;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;

import com.mnt.bean.students.Employee;
import com.mnt.bean.students.Student;

/**
 * @author Nag
 *
 */
public class StudentsDetails {
	public static void main(String[] args)throws Exception {
         
		SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = sf.newSchema(new File("D:\\git\\UnMarshaling\\src\\main\\webapp\\student.xsd")); 
         JAXBContext jc = JAXBContext.newInstance(Student.class);
         Unmarshaller unmarshaller = jc.createUnmarshaller();
        unmarshaller.setSchema(schema);
       Student student=(Student)unmarshaller.unmarshal(new File("D:\\git\\UnMarshaling\\src\\main\\webapp\\studnets.xml"));
System.out.println("customer iss=="+student.getName()+"==userId iss=="+student.getPassId());
List<Employee> employees=student.getEmployes();

Iterator<Employee> iterator=employees.iterator();
while(iterator.hasNext())
{
	Employee employee=(Employee)iterator.next();
	System.out.println(employee.getEmpId()+employee.getEmpName());
}

System.out.println("employees size=="+employees.size());
	}

}
