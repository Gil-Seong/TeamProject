package com.example.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.boot.service.DBConnectionServiceImpl;
import com.example.boot.vo.DBConnectionVo;

@Controller
public class DBConnectionController {
	
	@Autowired
	DBConnectionServiceImpl dbconnectionServiceImpl;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value="testdb.do", method=RequestMethod.GET)
	public String hello2() {
		
		return "/views/dbTest";
	}
	
	@ResponseBody
	@RequestMapping(value="dbtest.data", method=RequestMethod.POST)
	public String dbTestData(HttpServletRequest req) {
		
		String text = req.getParameter("dbinsert_data");
		
		logger.info("ajax_data : " + text);
		logger.debug("debug_test");
		
		DBConnectionVo dbvo = new DBConnectionVo();
		dbvo.setSubject(text);
		dbvo.setContent("내용입니다.");
		dbvo.setWriter("작성자입니다.");
		
		
		try {
			dbconnectionServiceImpl.addBoard(dbvo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "";
	}
}
