package com.qhit.lh.bella.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.bella.t2.bean.Emp;
import com.qhit.lh.bella.t2.bean.User;
import com.qhit.lh.bella.t2.service.BaseService;
import com.qhit.lh.bella.t2.service.impl.BaseServiceImpl;

/**
 * @author �β���
 *TODO
 * 2017��12��13������9:33:42
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	/**
	 * ���Ա����������һ���˻�
	 */
	@Test
	public void add() {
		//����Ա������
		Emp emp = new Emp();
		emp.setEmpName("jack");
		emp.setEmpSex("F");
		emp.setBirthday("2017-12-13");
		emp.setDeptId(1);
		//����һ���˻�
		User user = new User();
		user.setUserName("jack");
		user.setPassword("66666");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ�˻�������Ա��

		//��������
		baseService.add(emp);

	}

	@Test
	public void delete() {
		Emp emp = new Emp();
		emp = (Emp) baseService.getObjectById(emp, 3);
		baseService.delete(emp);
	}

	@Test
	public void update() {
		//����Ա������
		Emp emp = new Emp();
		emp.setEid(2);
		emp.setEmpName("tomcat");
		emp.setEmpSex("F");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		//����һ���˻�
		User user = new User();
		user.setUserId(2);
		user.setUserName("tomcat");
		user.setPassword("654321");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ�˻�������Ա��

		//��������
		baseService.update(emp);
	}

	@Test
	public void query() {
		List<Object> list = baseService.getAll("from Emp");
		
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
}
