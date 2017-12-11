package com.qhit.lh.bella.t1;

import org.junit.Test;

import com.qhit.lh.bella.t1.bean.Dept;
import com.qhit.lh.bella.t1.service.BaseService;
import com.qhit.lh.bella.t1.service.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void addDept() {
		//1，声明并实例化对象
		Dept dept = new Dept();
		dept.setName("信息中心");
		//2,操作对象
		baseService.add(dept);
	}


}
