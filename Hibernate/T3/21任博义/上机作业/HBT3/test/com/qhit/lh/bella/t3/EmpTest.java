package com.qhit.lh.bella.t3;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.bella.t3.bean.Dept;
import com.qhit.lh.bella.t3.bean.Emp;
import com.qhit.lh.bella.t3.bean.User;
import com.qhit.lh.bella.t3.servcie.BaseService;
import com.qhit.lh.bella.t3.servcie.impl.BaseServiceImpl;

/**
 * @author �β���
 *TODO
 * 2017��12��13������10:00:37
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
		emp.setEmpName("dada");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-13");
		//����һ���˻�
		User user = new User();
		user.setUserName("dada");
		user.setPassword("123456");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ�˻�������Ա��
		//���������Ĳ���
		Dept dept = new Dept();
		dept =	(Dept) baseService.getObjectById(dept, 3);
		//�������һ�Ĺ���
		emp.setDept(dept);
		//��������
		baseService.add(emp);

	}

	@Test
	public void delete() {
		Emp emp = new Emp();
		emp = (Emp) baseService.getObjectById(emp, 5);
		baseService.delete(emp);
	}

	@Test
	public void update() {
		//����Ա������
		Emp emp = new Emp();
		emp = (Emp) baseService.getObjectById(emp, 7);
		emp.setEmpName("tomdog");
		User user = emp.getUser();
		user.setUserName("tomdog");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ�˻�������Ա��
		//�޸������Ĳ��ţ��������޸Ĳ��ű������Ϣ
		Dept dept = new Dept();
		dept =	(Dept) baseService.getObjectById(dept, 2);
		//�������һ����
		emp.setDept(dept);
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
