package com.example.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.boot.mapper.DBConnectionTest;
import com.example.boot.vo.DBConnectionVo;

@Service
public class DBConnectionServiceImpl {
	
	@Autowired
	DBConnectionTest dbMapper;
	
	public void addBoard(DBConnectionVo DBVo) throws Exception{
		
		dbMapper.boardInsert(DBVo);
		
	}
	
	public List<DBConnectionVo> getBoard() throws Exception{
		return dbMapper.boardSelect();
	}

}
