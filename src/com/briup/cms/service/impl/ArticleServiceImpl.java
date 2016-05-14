package com.briup.cms.service.impl;

import com.briup.cms.bean.Article;
import com.briup.cms.dao.ArticleDao;
import com.briup.cms.service.IArticleService;

public class ArticleServiceImpl implements IArticleService{

	private ArticleDao articleDao = new ArticleDao();
	@Override
	public void add(Article article) {
		articleDao.save(article);
		
	}

}
