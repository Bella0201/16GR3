
package com.qhit.lh.gr3.bella.t4.dao;

import java.util.List;

/**
 * @author �β���
 *TODO
 * 2017��12��14������4:58:49
 */
public interface BaseDao {
	
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
	 * ����id��ѯ
	 */
	public Object getObjectById(Class clazz, int id);
}
