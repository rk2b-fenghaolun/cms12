package com.briup.cms.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 栏目的处理类
 * */
public class CategoryAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String name;
	private String code;
	private Long id;
	
	private ICategoryService categoryService = new CategoryServiceImpl();
	private List<Category> list;
	/**
	 * 处理添加栏目信息的方法
	 * */
	@Action(value="addCategory")
	public void addCategory(){
		Category category = new Category(null, name, code);
		categoryService.add(category);
	}
	/**
	*查看栏目信息的方法
	*/
	@Action(value="toCategoryManager",results={
			@Result(name="success",
					location="/WEB-INF/jsp/manager/categoryManager.jsp")
	})
	public List<Category> toCategoryManager(){
		list = categoryService.list();
		return list ;
	}
	/**
	 * 删除栏目信息的方法
	 * */
	@Action(value="deleteCategory")
	public void deleteCategory(){
		categoryService.delete(id);
	}

	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Category> getList() {
		return list;
	}

	public void setList(List<Category> list) {
		this.list = list;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
