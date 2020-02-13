package com.atguigu.springboot;


import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot0213ApplicationTests {

	@Autowired
	DataSource dataSource;
	
	@Test
	public void contextLoads() {
		System.out.println(dataSource.getClass());
	}

}
