package com.qhit.lh.bella.t1;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.bella.t1.bean.User;
import com.qhit.lh.bella.t1.service.BaseService;
import com.qhit.lh.bella.t1.service.impl.BaseServiceImpl;

public class UserTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void addUser() {
		//������ʵ��������
		User user = new User();
		user.setUname("jack");
		user.setUpwd("123456");
		user.setBirthday("2017-12-11");
		user.setSex("m");
		user.setEnable(1);
		//���ݲ���
		baseService.add(user);
	}

	@Test
	public void deleteUser(){
		//������ʵ��������
		User user = new User();
		user.setId(6);
		//��������
		baseService.delete(user);
	}
	@Test
	public void update(){
		//������ʵ��������
		User user = new User();
		user.setId(2);
		user.setUname("funcation");
		user.setUpwd("6666");
		user.setBirthday("2017-12-11");
		user.setSex("m");
		user.setEnable(1);
		//���ݲ���
		baseService.update(user);
	}
	
	/**
	 * User:����
	 * user:������
	 * t_user:����
	 */
	@Test
	public void getAll(){
		List<Object> list =  baseService.getAll("from User");
		for (Object object : list) {
			User user = (User) object;
			System.out.println(user.toString());
		}
	}

}
