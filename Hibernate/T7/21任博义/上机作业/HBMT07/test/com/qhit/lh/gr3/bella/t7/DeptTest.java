package com.qhit.lh.gr3.bella.t7;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t7.bean.Dept;
import com.qhit.lh.gr3.bella.t7.service.BaseService;
import com.qhit.lh.gr3.bella.t7.service.impl.BaseServiceImpl;

/**
 * @author �β���
 *2017��12��26������10:33:09
 * TODO
 */
public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		//��������
		Dept dept = new Dept();
		dept.setDeptName("��ʳ��");
		
		baseService.add(dept);
	}

}
