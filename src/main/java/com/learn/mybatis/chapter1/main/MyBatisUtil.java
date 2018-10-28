package com.learn.mybatis.chapter1.main;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory sqlSessionFactory = null;
	
	public static SqlSessionFactory getSqlSessionFactory() {
		InputStream inputStream = null;
		if(sqlSessionFactory == null) {
			String resource = "mybatis_config.xml";
			
			try {
				inputStream = Resources.getResourceAsStream(resource);
				sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				return sqlSessionFactory;
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return sqlSessionFactory;
	}
}
