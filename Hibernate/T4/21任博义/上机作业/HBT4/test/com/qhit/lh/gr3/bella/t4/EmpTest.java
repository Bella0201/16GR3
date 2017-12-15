package com.qhit.lh.gr3.bella.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t4.bean.Dept;
import com.qhit.lh.gr3.bella.t4.bean.Emp;
import com.qhit.lh.gr3.bella.t4.bean.User;
import com.qhit.lh.gr3.bella.t4.servcie.BaseService;
import com.qhit.lh.gr3.bella.t4.servcie.impl.BaseServiceImpl;

/**
 * @author 任博义
 *TODO
 * 2017年12月15日下午10:08:22
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
	//
		Emp emp = new Emp();
		emp.setEmpName("王云纳");
		emp.setEmpSex("F");
	//账户密码
		User user = new User();
		user.setUserName("wyn");
		user.setPassword("123456");
		//部门
        Dept dept = (Dept) baseService.getObjectById(Dept.class, 5);
		
		//一对一
        emp.setUser(user);
		user.setEmp(emp);
		//多对一
		emp.setDept(dept);
		
		baseService.add(emp);
	}

}
