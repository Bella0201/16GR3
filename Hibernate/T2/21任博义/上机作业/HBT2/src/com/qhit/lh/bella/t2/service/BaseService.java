
package com.qhit.lh.bella.t2.service;

import java.util.List;
/**
 * @author �β���
 *TODO
 * 2017��12��13������9:21:42
 */
public interface BaseService {
	/**
	 * @param obj
	 *��
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
	 * ����ID��ѯ
	 */
	public Object getObjectById(Object obj, int id);
}
