package edu.tinzel.mybatis.util;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil { //��ȡSqlSession������
	private final static SqlSessionFactory sqlSessionFactory; //����SqlSessionFactory����
	
	static{
		String resource = "mybatis-config.xml"; //MyBatis�����ļ���λ��src·��
		Reader reader = null;
		try {
			reader = Resources.getResourceAsReader(resource);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);	
	}
	
	public static SqlSessionFactory getSqlSessionFactory(){ //���ص���SqlSessionFactory����
		return sqlSessionFactory;
	}
}
