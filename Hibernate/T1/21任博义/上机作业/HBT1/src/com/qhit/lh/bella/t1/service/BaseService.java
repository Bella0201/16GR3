package com.qhit.lh.bella.t1.service;

import java.util.List;

/**
 * @author �β���
 *TODO
 * 2017��12��11������4:12:57
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
}
