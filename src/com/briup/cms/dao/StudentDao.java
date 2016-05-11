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
				if (conn != null) {
					conn.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
