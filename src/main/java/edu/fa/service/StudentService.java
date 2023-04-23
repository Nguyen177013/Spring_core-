package edu.fa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.fa.model.Student;
import edu.fa.repository.StudentRepository;
import edu.fa.repository.IStudentRepository;

public class StudentService implements IStudentService {
	private IStudentRepository studentrepository;
	
	public StudentService() {
		super();
		System.out.println("Default Injection");
		System.out.println(studentrepository);
	}

	public StudentService(IStudentRepository studentrepository) {
		super();
		System.out.println("Constructor Injection");
		
		this.studentrepository = studentrepository;
	}

	public IStudentRepository getStudentrepository() {
		return studentrepository;
	}
	
	@Autowired
	public void setStudentrepository(IStudentRepository studentrepository) {
		System.out.println("Setter Injection");
		this.studentrepository = studentrepository;
	}


	@Override
	public List<Student> getAllStudent(){
		return studentrepository.getAllStudent();
	}
}
