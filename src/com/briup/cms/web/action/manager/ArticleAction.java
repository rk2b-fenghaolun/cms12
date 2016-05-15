package com.briup.cms.web.action.manager;


import java.util.Date;

import org.apache.struts2.convention.annotation.Action;

import com.briup.cms.bean.Article;
import com.briup.cms.service.IArticleService;
import com.briup.cms.service.impl.ArticleServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IArticleService articleService = new ArticleServiceImpl();
	
	private String title;
	private String name;
	private Date articledate;
	private String content;
	
	
	@Action(value="addArticle")
	public void addArticle(){
		Article article = new Article(null,title,name,content,articledate);
		articleService.add(article);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getArticledate() {
		return articledate;
	}
	public void setArticledate(Date articledate) {
		this.articledate = articledate;
	}
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
