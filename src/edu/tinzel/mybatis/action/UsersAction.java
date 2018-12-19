package edu.tinzel.mybatis.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;






import edu.tinzel.mybatis.entity.Users;
import edu.tinzel.mybatis.service.UsersService;
import edu.tinzel.mybatis.util.ActionUtil;

public class UsersAction extends ActionUtil{
	private Users u;

	public Users getU() {
		return u;
	}

	public void setU(Users u) {
		this.u = u;
	}
	
	UsersService us=new UsersService();
	
	public String dl(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("username", this.getU().getUsername());
		parms.put("userpwd", this.getU().getUserpwd());
		Users u=us.dl(parms);
		if(u!=null){
			
			return this.query();
		}else{
			super.getRequest().put("msg", "ÕËºÅÃÜÂë´íÎó");
			return "dl";
		}
		
	}
	public String query(){
		super.getRequest().put("list", us.query());
		return "query";
	}
	public String queryByName(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("username", this.getU().getUsername());
		parms.put("minage", this.getU().getMinage());
		parms.put("maxage", this.getU().getMaxage());
		List<Map<String, Object>> list=us.queryByName(parms);
		super.getRequest().put("list", list);
		return "query";
	}
	public String getone(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("id", this.getU().getId());
			Users u=us.getone(parms);
			super.getRequest().put("u", u);
			return "update";
	}
	public String update(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("id", this.getU().getId());
		parms.put("username", this.getU().getUsername());
		parms.put("userpwd", this.getU().getUserpwd());
		parms.put("age", this.getU().getAge());
		us.update(parms);
		return "success";
		
	}
	public String del(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("id", this.getU().getId());
		us.del(parms);
		return "success";
	}
	public String save(){
		Map<String, Object> parms=new HashMap<String, Object>();
		parms.put("username", this.getU().getUsername());
		parms.put("userpwd", this.getU().getUserpwd());
		parms.put("age", this.getU().getAge());
		us.save(parms);
		return "success";
	}
}
