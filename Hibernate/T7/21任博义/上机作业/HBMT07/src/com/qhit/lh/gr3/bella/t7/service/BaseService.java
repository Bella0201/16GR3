package com.qhit.lh.gr3.bella.t7.service;

import java.util.List;

import com.qhit.lh.gr3.bella.t7.bean.Emp;

/**
 * @author 任博艺
 *2017年12月26日下午10:32:11
 * TODO
 */
public interface BaseService {
	
	public List<Emp> getEmpByName(String name);
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);
	
	/**
	 * @param obj
	 * @param id
	 * @return
	 * 根据id去查
	 */
	public Object getObjectById(Class clazz, int id);
}
