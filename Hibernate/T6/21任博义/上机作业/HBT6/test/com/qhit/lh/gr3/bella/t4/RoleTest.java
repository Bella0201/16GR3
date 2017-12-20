package com.qhit.lh.gr3.bella.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t4.bean.Role;
import com.qhit.lh.gr3.bella.t4.bean.User;
import com.qhit.lh.gr3.bella.t4.servcie.BaseService;
import com.qhit.lh.gr3.bella.t4.servcie.impl.BaseServiceImpl;

/**
 * @author 任博义
 *TODO
 * 2017年12月20日上午10:21:31
 */
public class RoleTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		//新建一个角色
		Role role = new Role();
		role.setRoleName("主任");
		role.setMemo("办公室");
		//获取账户
		User user = (User) baseService.getObjectById(User.class, 2);
	   //建立角色和账户关系
		role.getUsers().add(user);
		baseService.add(role);
	}
	@Test
	public void delete() {
		Role role = (Role) baseService.getObjectById(Role.class, 1);
		
		baseService.delete(role);	
	}
	@Test
	public void update() {
		Role role = (Role) baseService.getObjectById(Role.class, 5);
		role.setMemo("周口");
		
		//获取账户信息
		User user1 = (User) baseService.getObjectById(User.class,7);
		User user2 = (User) baseService.getObjectById(User.class,6);
		User user3 = (User) baseService.getObjectById(User.class,10);
		
		role.getUsers().add(user1);
		role.getUsers().add(user2);
		role.getUsers().add(user3);
		
		baseService.update(role);
	}
	@Test
	public void query() {
		Role role = (Role) baseService.getObjectById(Role.class, 2);
		
		for(User user : role.getUsers()){
			System.out.println(role.getRoleName()+":"+user.getUserName());
			
		}
	}

}
