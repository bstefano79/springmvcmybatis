package com.mybatisspring.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatisspring.model.User;

@Repository
public class UserRepository {
	@Autowired SqlSessionFactory sqlSessionFactory;
	
	public List<User> getAll(){
		SqlSession session = null;
		session = sqlSessionFactory.openSession();
        List<User> lista = session.selectList("getAll");
        return lista;
		
	}
}
