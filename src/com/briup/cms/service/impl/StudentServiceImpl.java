package com.briup.cms.service.impl;

import com.briup.cms.bean.Student;
import com.briup.cms.dao.StudentDao;
import com.briup.cms.service.IStudentService;

public class StudentServiceImpl implements IStudentService {
	private StudentDao studentDao = new StudentDao();

	public void add(Student student) {
		studentDao.AddStudent(student);
	}

}
