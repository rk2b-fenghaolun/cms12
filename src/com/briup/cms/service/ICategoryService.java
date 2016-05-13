package com.briup.cms.service;

import java.util.List;

import com.briup.cms.bean.Category;

/**
 * 栏目管理的接口
 * 定义系统功能
 * @author licy
 * @date 2016.5.7
 * */
public interface ICategoryService {
	/**
	 * 添加栏目
	 * */
	void add(Category category);
	List<Category> list();
	void delete(Long id);
}
