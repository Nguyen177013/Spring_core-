package edu.fa.repository;


import java.util.ArrayList;
import java.util.List;

import edu.fa.model.Student;

public class StudentRepository implements IStudentRepository{

	public List<Student> getAllStudent(){
		List<Student> list = new ArrayList<>();
		list.add(new Student("Nguyen","HCM"));
		return list;
	}
}
