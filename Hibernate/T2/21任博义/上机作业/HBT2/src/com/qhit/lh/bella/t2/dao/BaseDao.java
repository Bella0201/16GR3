
package com.qhit.lh.bella.t2.dao;

import java.util.List;
/**
 * @author �β���
 *TODO
 * 2017��12��13������9:18:30
 */
public interface BaseDao {
	
	/**
	 * @param obj
	 * ��
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 *ɾ
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * ��
	 */
	public void update(Object obj);
	
	/**
	 *��
	 */
	public List<Object> getAll(String fromObject);
	
	/**
	 * @param obj
	 * @param id
	 * @return
	 * ����IDȥ��
	 */
	public Object getObjectById(Object obj, int id);
}
