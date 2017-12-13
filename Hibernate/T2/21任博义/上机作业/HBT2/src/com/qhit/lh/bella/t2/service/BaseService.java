
package com.qhit.lh.bella.t2.service;

import java.util.List;
/**
 * @author 任博义
 *TODO
 * 2017年12月13日上午9:21:42
 */
public interface BaseService {
	/**
	 * @param obj
	 *增
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
	 * 根据ID查询
	 */
	public Object getObjectById(Object obj, int id);
}
