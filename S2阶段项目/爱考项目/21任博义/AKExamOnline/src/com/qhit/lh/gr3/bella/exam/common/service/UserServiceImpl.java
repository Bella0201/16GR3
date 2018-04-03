/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.common.service;

import com.qhit.lh.gr3.bella.exam.common.bean.User;
import com.qhit.lh.gr3.bella.exam.common.dao.UserDao;
import com.qhit.lh.gr3.bella.exam.common.dao.UserDaoImpl;

/**
 * @author 任博艺
 *2018年1月4日下午5:15:34
 * TODO
 */
public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
