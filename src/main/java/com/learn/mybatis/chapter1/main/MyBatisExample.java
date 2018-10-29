package com.learn.mybatis.chapter1.main;
import org.apache.ibatis.session.SqlSession;
import com.learn.mybatis.chapter1.mapper.RoleMapper;
import com.learn.mybatis.chapter1.pojo.Role;

public class MyBatisExample {

	public static void main(String args[]) {
		SqlSession sqlSession = null;
		try {
			 sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
			 RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
			 Role role = roleMapper.getRole(2);
			 System.err.println("role_name=>"+ role.getRoleName());
			 
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}
		
	}

}
