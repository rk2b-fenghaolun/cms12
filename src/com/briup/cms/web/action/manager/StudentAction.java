package com.briup.cms.web.action.manager;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Category;
import com.briup.cms.bean.Student;
import com.briup.cms.service.IStudentService;
import com.opensymphony.xwork2.ActionSupport;
import com.briup.cms.service.impl.StudentServiceImpl;

public class StudentAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String number;

	private IStudentService studentService = new StudentServiceImpl();

	@Action(value = "addStudent")
	public void addStudent() {
		Student student = new Student(null, name, number);
		studentService.add(student);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
