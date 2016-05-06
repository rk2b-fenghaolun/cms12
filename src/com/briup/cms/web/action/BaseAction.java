package com.briup.cms.web.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 前台基础Action
 * */
public class BaseAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 跳转到前台的首页
	 * http://ip:port/项目名/命名空间/action名.后缀
	 * http://localhost:8888/cms/toIndex.action
	 * 当返回值为“success”的时候页面跳转到/WEB-INF/jsp/index.jsp
	 * */
	@Action(value="toIndex",results={
			@Result(name="success",location="/WEB-INF/jsp/index.jsp")})
	public String toIndex(){
		System.out.println("toindex......");
		return "success";
	}
}
