package com.zhenglj.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void doQuery(){
		String sql="select * from user";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		for (Map<String, Object> map : queryForList) {
			System.out.println(map);
		}
	}
}
