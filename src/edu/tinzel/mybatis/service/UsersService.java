package edu.tinzel.mybatis.service;

import java.util.List;
import java.util.Map;

import edu.tinzel.mybatis.dao.UsersDao;
import edu.tinzel.mybatis.entity.Users;

public class UsersService {
	UsersDao dao=new UsersDao();
	
	public List<Map<String, Object>> query(){
		return dao.query();
	}
	public Users dl(Map<String, Object> parms){
		return dao.dl(parms);
	}
	public void save(Map<String, Object> parms){
		 dao.save(parms);
	}
	public Users getone(Map<String, Object> parms){
		return dao.getone(parms);
	}
	public void del(Map<String, Object> parms){
		dao.del(parms);
	}
	public void update(Map<String, Object> parms){
		dao.update(parms);
	}
	public List<Map<String, Object>> queryByName(Map<String, Object> parms){
		return dao.queryByName(parms);
	}
}
