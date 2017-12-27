package com.qhit.lh.gr3.bella.t7.dao;

import java.util.List;

import com.qhit.lh.gr3.bella.t7.bean.Emp;

/**
 * @author �β���
 *2017��12��26������10:31:37
 * TODO
 */
public interface BaseDao {
	
	public List<Emp> getEmpByName(String name);
	/**
	 * @param obj
	 * ��
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * ɾ
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * ��
	 */
	public void update(Object obj);
	
	/**
	 * ��
	 */
	public List<Object> getAll(String fromObject);
	
	/**
	 * @param obj
	 * @param id
	 * @return
	 * ����idȥ��
	 */
	public Object getObjectById(Class clazz, int id);
}
