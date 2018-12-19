package test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




import org.apache.ibatis.session.SqlSession;
import org.junit.Test;






import edu.tinzel.mybatis.entity.Users;
import edu.tinzel.mybatis.mapper.UsersMapper;
import edu.tinzel.mybatis.util.MyBatisUtil;

public class UsersMapperTest {
	Map<String, Object> parms=new HashMap<String, Object>();
	@Test
	public void testSave() {
/*		parms.put("'username','userpwd','age'","'1','1','21'");*/
		parms.put("username", "’≈’Ê");
		parms.put("userpwd", "13");
		parms.put("age", "23");
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.save(parms);
		session.commit();
		session.close();
	}

	@Test
	public void testGetone() {
		parms.put("id", 1);
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		Users u=user.getone(parms);
		System.out.println(u);
		session.close();
	}

	@Test
	public void testQuery(){
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		List<Map<String, Object>> list=user.query();
		System.out.println(list);
		session.close();
	}

	@Test
	public void testQueryByName() {
		parms.put("username", "");
		parms.put("minage", "2");
		parms.put("maxage", "23");
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		List<Map<String, Object>> list=user.queryByName(parms);
		System.out.println(list);
		session.close();
	}

	@Test
	public void testDel() {
		parms.put("id", 12);
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.del(parms);
		session.commit();
		session.close();
	}

	@Test
	public void testUpdate() {
		parms.put("username","–Ï—Ù");
		parms.put("userpwd","123");
		parms.put("age","10");
		parms.put("id", 13);
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		user.update(parms);
		session.commit();
		session.close();
	}

	@Test
	public void testDl() {
		parms.put("username", "666");
		parms.put("userpwd", "666");
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UsersMapper user=session.getMapper(UsersMapper.class);
		Users u=user.dl(parms);
		System.out.println(u);
		session.close();
	}

}
