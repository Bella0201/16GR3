package com.qhit.lh.gr3.bella.t7.service.impl;

import java.util.List;

import com.qhit.lh.gr3.bella.t7.bean.Emp;
import com.qhit.lh.gr3.bella.t7.dao.BaseDao;
import com.qhit.lh.gr3.bella.t7.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.bella.t7.service.BaseService;

/**
 * @author 任博艺
 *2017年12月26日下午10:32:18
 * TODO
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}

}
