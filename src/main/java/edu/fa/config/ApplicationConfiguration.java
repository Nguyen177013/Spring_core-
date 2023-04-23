package edu.fa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.fa.repository.IStudentRepository;
import edu.fa.repository.StudentRepository;
import edu.fa.service.IStudentService;
import edu.fa.service.StudentService;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name = "studentService") // This bean generate like new StudentService stuff (idk)s
	public IStudentService getStudentService() {
		return new StudentService();   //Constructor Injection
//		StudentService service = new StudentService();
//		service.setStudentrepository(getStudentRepository());
//		return service;										//Setter Injection
		
	}
	
	@Bean(name ="studentRepository")
	public IStudentRepository getStudentRepository() {
		return new StudentRepository();
	}
}
