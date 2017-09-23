package com.example.tutorial3.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.example.tutorial3.model.StudentModel;

public class InMemoryStudentService implements StudentService{
	private static List<StudentModel> studentList = new ArrayList<StudentModel>();
	
	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel hasil = null;
		for(int i=0;i<studentList.size();i++){
			StudentModel siswa = studentList.get(i);
			if(siswa.getNpm().equals(npm)) {
				hasil = siswa;
			}
		}
		return hasil;
	}
	
	@Override
	public List<StudentModel> selectAllStudents() {
		return studentList;
	}
	
	@Override
	public void addStudent(StudentModel student) {
		studentList.add(student);
	}
	
	public void deleteStudent(StudentModel student) {
		studentList.remove(student);
	}
}
