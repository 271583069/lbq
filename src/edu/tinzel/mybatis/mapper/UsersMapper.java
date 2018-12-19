package edu.tinzel.mybatis.mapper;

import java.util.List;
import java.util.Map;

import edu.tinzel.mybatis.entity.Users;

public interface UsersMapper {
	
	
	void save(Map<String, Object> parms);
	
	Users getone(Map<String, Object> parms);
	
	List<Map<String, Object>> query();
	
	List<Map<String, Object>> queryByName(Map<String, Object> parms);
	
	void del(Map<String, Object> parms);
	
	void update(Map<String, Object> parms);
	
	Users dl(Map<String, Object> parms);
}
