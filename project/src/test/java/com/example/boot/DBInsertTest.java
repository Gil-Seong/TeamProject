package com.example.boot;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.boot.mapper.DBConnectionTest;
import com.example.boot.vo.DBConnectionVo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringBoot02Application.class)
@WebAppConfiguration
public class DBInsertTest {

	
	@Autowired
    private DBConnectionTest mapper;
    
    @Test
    public void contextLoads2() {
    }
    
    @Test
    public void testMapper() throws Exception{//작성
        
        DBConnectionVo vo = new DBConnectionVo();
        
        vo.setSubject("제목입니다.");
        vo.setContent("내용입니다.");
        vo.setWriter("작성자입니다.");
        
        mapper.boardInsert(vo);
        
    }

}
