package com.qhit.lh.bella.t1.dao;

import java.util.List;

/**
 * @author �β���
 *TODO
 * 2017��12��11������3:56:51
 */
public interface BaseDao {
	/**
	 *��
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * ɾ
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * ��
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * ��
	 */
	public List<Object> getAll(String fromObject);

}
