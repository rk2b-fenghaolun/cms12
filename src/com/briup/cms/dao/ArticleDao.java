package com.briup.cms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.briup.cms.bean.Article;
import com.briup.cms.common.ConnectionFactory;

public class ArticleDao {
	/**
	 * 将article对象中的发布信息保存到数据库信息表中
	 * @param 信息对象
	 * */
	public void save(Article article){
		try {
			Connection conn = null;
			PreparedStatement pstmt = null;
			try{
				//获取连接
				conn = ConnectionFactory.getConn();
				String sql = "insert into t_article(name,title,articledate) values(?,?,?)";
				//预处理sql
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, article.getName());
				pstmt.setString(2, article.getTitle());
				pstmt.setDate(3, (Date) article.getArticledate());
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
