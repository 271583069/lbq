package edu.tinzel.mybatis.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil { //获取SqlSession工具类
	private final static SqlSessionFactory sqlSessionFactory; //单例SqlSessionFactory对象
	
	static{
		String resource = "mybatis-config.xml"; //MyBatis配置文件，位于src路径
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);	
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){ //返回单例SqlSessionFactory对象
		return sqlSessionFactory;
	}
}
