package com.learn.mybatis.chapter1.main;

import javax.management.relation.Role;

import org.apache.ibatis.session.SqlSession;
import com.learn.mybatis.chapter1.mapper.RoleMapper;

public class MyBatisExample {

	public static void main(String args[]) {
		SqlSession sqlSession = null;
		System.out.println("1>>>>>>>>>>>>");
		try {
			 sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
			 System.out.println("2<<<<<<<<<<");
			 RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			 System.out.println("3<<<<<<<");
			 Role role = roleMapper.getRole(2);
			 System.out.println("$<<<<<<<<");
			 System.err.println("role_name=>"+ role.getRoleName());
			 System.out.println("sdfasdfasddddddddddddddddddddddd");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
	}

}
