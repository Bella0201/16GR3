
package com.qhit.lh.gr3.bella.t4.servcie;

import java.util.List;

/**
 * @author �β���
 *TODO
 * 2017��12��14������5:00:55
 */
public interface BaseService {
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
