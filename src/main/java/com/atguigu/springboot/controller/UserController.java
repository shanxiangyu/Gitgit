package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springboot.bean.TAdmin;
import com.atguigu.springboot.service.AdminService;

@RestController
public class UserController {

	@Autowired
	AdminService adminService;
	
	@RequestMapping("/get/{id}")
	public TAdmin getAdminById(@PathVariable("id") Integer id) {
<<<<<<< HEAD
		System.out.println("111");
		System.out.println("222");
=======
		System.out.println("11");
		System.out.println("10");
>>>>>>> branch 'master' of https://github.com/shanxiangyu/Gitgit.git
		return adminService.getAdminById(id);
	}
}
