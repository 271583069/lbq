package edu.tinzel.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import edu.tinzel.mybatis.entity.Users;
import edu.tinzel.mybatis.mapper.UsersMapper;
import edu.tinzel.mybatis.util.MyBatisUtil;



public class UsersDao implements UsersMapper{

	@Override
	public void save(Map<String, Object> parms) {
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.save(parms);
		session.commit();
		session.close();
		
	}

	@Override
	public Users getone(Map<String, Object> parms) {
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		Users u=user.getone(parms);
		session.close();
		return u;
	}

	@Override
	public List<Map<String, Object>> query() {
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		List<Map<String, Object>> list=user.query();
		session.close();
		return list;
	}

	@Override
	public List<Map<String, Object>> queryByName(Map<String, Object> parms) {
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		List<Map<String, Object>> list=user.queryByName(parms);
		session.close();
		return list;
	}

	@Override
	public void del(Map<String, Object> parms) {
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.del(parms);
		session.commit();
		session.close();
		
	}

	@Override
	public void update(Map<String, Object> parms) {
		// TODO Auto-generated method stub
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.update(parms);
		session.commit();
		session.close();
	}

	@Override
	public Users dl(Map<String, Object> parms) {
		// TODO Auto-generated method stub
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		Users u=user.dl(parms);
		session.close();
		return u;
	}
	
}
