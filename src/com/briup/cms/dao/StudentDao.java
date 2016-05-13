package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public List<Student> list(){
		List<Student> list = new ArrayList<Student>();
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
		try{
			conn = ConnectionFactory.getConn();
			String sql = "select * from t_student";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				Student student = new Student();
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				String number = rs.getString("number");
				student.setId(id);
				student.setName(name);
				student.setNumber(number);
				list.add(student);
			}
		}finally{
			ConnectionFactory.close(rs, pstmt, conn);
		}
	}catch (Exception e){
		e.printStackTrace();
	}
	return list;
	}
	
	
	public void delete(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{
			try{
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_student where id = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
