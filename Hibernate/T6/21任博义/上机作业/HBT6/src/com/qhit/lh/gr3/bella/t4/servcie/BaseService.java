
package com.qhit.lh.gr3.bella.t4.servcie;

import java.util.List;

/**
 * @author 任博义
 *TODO
 * 2017年12月14日下午5:00:55
 */
public interface BaseService {
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
	 * 根据id查询
	 */
	public Object getObjectById(Class clazz, int id);
}
