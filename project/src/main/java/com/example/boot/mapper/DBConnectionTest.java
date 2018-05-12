package com.example.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.boot.vo.DBConnectionVo;

//@Mapper
public interface DBConnectionTest {

	public void boardInsert(DBConnectionVo vo) throws Exception;
	
}
