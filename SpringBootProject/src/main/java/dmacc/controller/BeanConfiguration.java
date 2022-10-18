/**
 *@auther [user} amkoraishi@dmacc.edu
 *CIS175-Fal2022
 *Oct 17, 2022
  */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.CampusAddress;
import dmacc.beans.Student;

@Configuration
public class BeanConfiguration {
	@Bean
	public Student student() {
		Student bean = new Student();
		bean.setName("Dr. Seuss");
		bean.setPhone("555-555-5555");
		bean.setMajor("Computer Sience");
		return bean;
	}

	@Bean
	public CampusAddress campusAddress() {
		CampusAddress bean = new CampusAddress("123 Main Street", "Des Moines", "IA");
		return bean;
	}

}
