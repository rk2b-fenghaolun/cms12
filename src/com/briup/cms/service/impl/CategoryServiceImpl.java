package com.briup.cms.service.impl;


import java.util.List;

import com.briup.cms.bean.Category;
import com.briup.cms.dao.CategoryDao;
import com.briup.cms.service.ICategoryService;
/**
 * 业务逻辑实现类
 * 事务管理
 * 复杂业务逻辑处理
 * @param <category>
 * */
public class CategoryServiceImpl implements ICategoryService {
	//关联Dao对象
	private CategoryDao categoryDao = new CategoryDao();
	/**
	 * 添加栏目
	 * */
	@Override
	public void add(Category category) {
		categoryDao.save(category);
	}
	public List<Category> list(){
		return categoryDao.list();
	}
	@Override
	public void delete(Long id) {
		categoryDao.delete(id);
		
	}

}
