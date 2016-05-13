package com.briup.cms.web.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.briup.cms.bean.Category;
import com.briup.cms.service.ICategoryService;
import com.briup.cms.service.impl.CategoryServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 前台基础Action
 * */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Category> list;
	private ICategoryService categoryService = new CategoryServiceImpl();
	
	/**
	 * 跳转到前台的首页
	 * http://ip:port/项目名/命名空间/action名.后缀
	 * http://localhost:8888/cms/toIndex.action
	 * 当返回值为“success”的时候页面跳转到/WEB-INF/jsp/index.jsp
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		//查询所有栏目的信息
		list = categoryService.list();
		return "success";
	}

	public List<Category> getList() {
		return list;
	}

	public void setList(List<Category> list) {
		this.list = list;
	}

	
}
