package com.mybatisspring.config;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {

		@Bean
		public SqlSessionFactory getSessionFactory() {
			String res = "mybatis-config.xml";	
			try {		
				Reader reader = Resources.getResourceAsReader(res);
				SqlSessionFactory sqlSessionFactory =
						   new SqlSessionFactoryBuilder().build(reader);
				return sqlSessionFactory;
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
}
