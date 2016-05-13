package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.common.ConnectionFactory;

/**
 * 关于栏目信息与数据库交互的类
 * 增删改查方法，不涉及业务逻辑处理
 * @author licy
 * @date 2016.5.7
 * */
public class CategoryDao {
	/**
	 * 将category对象中的栏目信息保存到数据库栏目表中
	 * @param 栏目对象
	 * */
	public void save(Category category){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_category(name,code) values(?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, category.getName());
				pstmt.setString(2, category.getCode());
				//执行sql
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 查询所有的栏目信息
	 * @return 包含栏目信息的集合
	 * */
	public List<Category> list(){
		List<Category> list = new ArrayList<Category>();
		try{
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try{
				conn = ConnectionFactory.getConn();
				String sql = "select * from t_category";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()){
					Category category = new Category();
					Long id = rs.getLong("id");
					String name = rs.getString("name");
					String code = rs.getString("code");
					category.setId(id);
					category.setCode(code);
					category.setName(name);
					list.add(category);
				}
			}finally{ConnectionFactory.close(rs, pstmt, conn);
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return list;
	}
	public void delete(Long id) {
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "delete from t_category where id = ?";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				//执行sql
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
