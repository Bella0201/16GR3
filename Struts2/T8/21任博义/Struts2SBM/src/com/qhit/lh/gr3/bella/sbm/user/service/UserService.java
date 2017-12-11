package com.qhit.lh.gr3.bella.sbm.user.service;

import java.util.List;

import com.qhit.lh.gr3.bella.sbm.user.bean.User;

public interface UserService {
	/**
	 * @return
	 * 查询所有的用户
	 * @throws Exception 
	 */
	public List<User> getAll() throws Exception;
	
	/**
	 * @param user
	 * @return
	 * 添加用户
	 */
	public int addUser(User user);

	/**
	 * @param userName
	 * @param userPassword
	 * @return
	 * 登录业务
	 */
	public User doLogin(String userName,String userPassword);
}
