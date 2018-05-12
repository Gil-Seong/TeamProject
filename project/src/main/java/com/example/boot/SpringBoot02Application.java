package com.example.boot;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@SpringBootApplication
@SpringBootTest(classes = SpringBoot02Application.class)
@MapperScan(value = {"com.example.boot.mapper"})
public class SpringBoot02Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot02Application.class, args);
	}
	
	   /**
     * SqlSessionFactory 설정
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource)throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
            sessionFactory.setDataSource(dataSource);
            
            Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/*Mapper.xml");
            
            sessionFactory.setMapperLocations(res);
            int i = 0;
            for(Resource mappers : res) {
            	System.out.println("mapper path["+i+"] :" +mappers);
            	i++;
            }
            
            
            return sessionFactory.getObject();
    }

}
