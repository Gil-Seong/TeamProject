package com.example.boot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBoot02Application.class)
public class SpringBoot02ApplicationTests {

	@Autowired
    private SqlSessionFactory sqlSession; //작성

	@Test
	public void contextLoads() {
	}
	
	  @Test
	    public void testSqlSession() throws Exception{//작성
	        
	        System.out.println("sqlSession : "+sqlSession);
	        
	    }


}
