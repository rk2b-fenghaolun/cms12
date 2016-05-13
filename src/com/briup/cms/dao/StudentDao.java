package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.briup.cms.bean.Student;
import com.briup.cms.common.ConnectionFactory;

public class StudentDao {
	public void AddStudent(Student student) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			try {
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_student(name, number) values(?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, student.getName());
				pstmt.setString(2, student.getNumber());
				pstmt.executeUpdate();
			} finally {
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public Student find(String name){
	Student student = null;
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		try{
			conn = ConnectionFactory.getConn();
			String sql = "select * from t_student where = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()){
				Long id = rs.getLong("id");
				String number = rs.getString("number");
				student = new Student(id, name, number);
			}
		}finally{
			ConnectionFactory.close(rs, pstmt, conn);
		}
	}catch (Exception e){
		e.printStackTrace();
	}
	return student;
	}
}
