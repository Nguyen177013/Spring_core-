package edu.fa;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.fa.config.ApplicationConfiguration;
import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;
import edu.fa.service.IStudentService;
import edu.fa.service.StudentService;

public class EducationApp {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
//		StudentService service =  (StudentService) context.getBean("studentService", StudentService.class); // this still work
		StudentService service =  (StudentService) context.getBean("studentService"); // still work ( idk why )
		Student student = service.getAllStudent().get(0);
		student.displayInfo();
	}
}
