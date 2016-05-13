package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Student;

public interface IStudentService {
void add(Student student);
List<Student> studentlist();
void delete(Long id);
}
