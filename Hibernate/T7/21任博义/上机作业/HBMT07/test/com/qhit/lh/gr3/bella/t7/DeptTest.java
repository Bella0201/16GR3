package com.qhit.lh.gr3.bella.t7;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t7.bean.Dept;
import com.qhit.lh.gr3.bella.t7.service.BaseService;
import com.qhit.lh.gr3.bella.t7.service.impl.BaseServiceImpl;

/**
 * @author 任博艺
 *2017年12月26日下午10:33:09
 * TODO
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		//创建部门
		Dept dept = new Dept();
		dept.setDeptName("零食部");
		
		baseService.add(dept);
	}

}
