package com.qhit.lh.gr3.bella.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t4.bean.Dept;
import com.qhit.lh.gr3.bella.t4.bean.Emp;
import com.qhit.lh.gr3.bella.t4.bean.User;
import com.qhit.lh.gr3.bella.t4.servcie.BaseService;
import com.qhit.lh.gr3.bella.t4.servcie.impl.BaseServiceImpl;

/**
 * @author �β���
 *TODO
 * 2017��12��15������10:08:22
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
	//
		Emp emp = new Emp();
		emp.setEmpName("������");
		emp.setEmpSex("F");
	//�˻�����
		User user = new User();
		user.setUserName("wyn");
		user.setPassword("123456");
		//����
        Dept dept = (Dept) baseService.getObjectById(Dept.class, 5);
		
		//һ��һ
        emp.setUser(user);
		user.setEmp(emp);
		//���һ
		emp.setDept(dept);
		
		baseService.add(emp);
	}

}
