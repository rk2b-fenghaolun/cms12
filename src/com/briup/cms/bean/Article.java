package com.briup.cms.bean;

import java.util.Date;

public class Article {
	private Long id;
	private String title;
	private String name;
	private Date articledate;
	private String content;
	
	public Article(){
		
	}
		
	public Article(Long id, String title, String name,String content, Date articledate) {
		super();
		this.id = id;
		this.title = title;
		this.name = name;
		this.content = content;
		this.articledate = articledate;
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

}
