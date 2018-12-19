package edu.tinzel.mybatis.util;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class ActionUtil  {
	
	
	//获取request对象
	public Map<String, Object> getRequest() {
		//通过ActionContext得到request对象
		return (Map) ActionContext.getContext().get("request");
	}

	//获取session对象
	public Map<String, Object> getSession() {
		return ActionContext.getContext().getSession();
	}

	//获取ServletContext对象
	public Map<String, Object> getApplication() {
		return (Map)ActionContext.getContext().getApplication();
	}
		
	//获取response对象
	public HttpServletResponse getResponse() {
		//通过ServletActionContext类获取HttpServletResponse对象。
		HttpServletResponse response = ServletActionContext.getResponse();
		//设置响应头与字符编码
		response.setContentType("text/html;charset=gbk");
		response.setCharacterEncoding("gbk");
		return response;
	}
}