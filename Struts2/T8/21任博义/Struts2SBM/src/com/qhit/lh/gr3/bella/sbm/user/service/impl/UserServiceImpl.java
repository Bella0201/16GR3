package com.qhit.lh.gr3.bella.sbm.user.service.impl;

import java.util.List;

import com.qhit.lh.gr3.bella.sbm.user.bean.User;
import com.qhit.lh.gr3.bella.sbm.user.dao.UserDao;
import com.qhit.lh.gr3.bella.sbm.user.dao.impl.UserDaoImpl;
import com.qhit.lh.gr3.bella.sbm.user.service.UserService;
/**
 * 
 * @author 任博义
 *TODO
 *2017年12月8日下午11:11:21
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

	@Override
	public User doLogin(String userName, String userPassword) {
		// TODO Auto-generated method stub
		return userDao.doLogin(userName, userPassword);
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}

	/* (non-Javadoc)
	 * @see com.qhit.lh.gr3.jay.sbm.user.service.UserService#getAll()
	 */
	@Override
	public List<User> getAll() throws Exception {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}
}
