package com.briup.cms.service.impl;

import java.util.List;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
import com.briup.cms.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentDao studentDao = new StudentDao();

	public void add(Student student) {
		studentDao.AddStudent(student);
	}

	@Override
	public List<Student> studentlist() {
		return  studentDao.list();
	}

	@Override
	public void delete(Long id) {
		studentDao.delete(id);
		
	}

}
