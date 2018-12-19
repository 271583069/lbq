package edu.tinzel.mybatis.util;

import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

public class ActionUtil  {
	
	
	//��ȡrequest����
	public Map<String, Object> getRequest() {
		//ͨ��ActionContext�õ�request����
		return (Map) ActionContext.getContext().get("request");
	}

	//��ȡsession����
	public Map<String, Object> getSession() {
		return ActionContext.getContext().getSession();
	}

	//��ȡServletContext����
	public Map<String, Object> getApplication() {
		return (Map)ActionContext.getContext().getApplication();
	}
		
	//��ȡresponse����
	public HttpServletResponse getResponse() {
		//ͨ��ServletActionContext���ȡHttpServletResponse����
		HttpServletResponse response = ServletActionContext.getResponse();
		//������Ӧͷ���ַ�����
		response.setContentType("text/html;charset=gbk");
		response.setCharacterEncoding("gbk");
		return response;
	}
}