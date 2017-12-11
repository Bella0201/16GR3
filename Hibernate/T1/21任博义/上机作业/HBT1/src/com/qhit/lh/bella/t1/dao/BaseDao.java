package com.qhit.lh.bella.t1.dao;

import java.util.List;

/**
 * @author 任博义
 *TODO
 * 2017年12月11日下午3:56:51
 */
public interface BaseDao {
	/**
	 *增
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * 删
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * 改
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);

}
