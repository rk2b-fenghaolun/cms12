package com.briup.cms.web.action.manager;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 后台基础Action
 * */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Category> list;
	private ICategoryService categoryService = new CategoryServiceImpl();
	
	/**
	 * 跳转到后台管理首页！
	 * http://localhost:8888/cms/manager/toIndex.action
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/index.jsp")
	})
	public String toIndex(){
		
		return "success";
	}
	
	/**
	 * @author 李四
	 * 跳转到后台管理中添加栏目页面！
	 * http://localhost:8888/cms/manager/toAddCategory.action
	 * */
	@Action(value="toAddCategory",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addCategory.jsp")
	})
	public String toAddCategory(){
		
		return "success";
	}
	
	/**
	 * @author 王五
	 * 跳转到栏目管理
	 * */
	@Action(value="toCategoryManager",results={
			@Result(name="success",
					location="/WEB-INF/jsp/manager/categoryManager.jsp")
	})
	public String toCategoryManager(){
		list = categoryService.list();
		return "success" ;
	}
	public List<Category> getList() {
		return list;
	}

	public void setList(List<Category> list) {
		this.list = list;
	}
	/**
	 * @author 冯浩伦
	 * 跳转到后台管理中添加学生页面！
	 * http://localhost:8888/cms/manager/toAddStudent.action
	 * */
	@Action(value="toAddStudent",results={
			@Result(name="success",location="/WEB-INF/jsp/manager/addStudent.jsp")
	})
	public String toAddStudent(){
		
		return "success";
	}
	/**
	 * @author 冯浩伦
	 * 跳转到学生管理
	 * */
	@Action(value="toStudentManager",results={
			@Result(name="success",
					location="/WEB-INF/jsp/manager/studentManager.jsp")
	})
	public String toStudentManager(){
		return "success" ;
	}

}
