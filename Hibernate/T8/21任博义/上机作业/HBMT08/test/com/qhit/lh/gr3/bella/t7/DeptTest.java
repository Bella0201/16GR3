package com.qhit.lh.gr3.bella.t7;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.qhit.lh.gr3.bella.t7.bean.Dept;
import com.qhit.lh.gr3.bella.t7.bean.Emp;
import com.qhit.lh.gr3.bella.t7.service.BaseService;
import com.qhit.lh.gr3.bella.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.bella.t7.utils.HibernateSessionFactory;

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
@Test
public void getEmpLikeName() {
	    //1����ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2��ͨ��session���󴴽�criteria������ѯ��
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("empName", "%��%"));
		//3��ͨ��criteria������ѯ�����в�ѯ
		List<Emp> list = criteria.list();
		//4���������
		for(Emp emp : list){
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
}
@Test
public void getEmpByDeptName() {
	    //1����ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//2��ͨ��session���󴴽�criteria������ѯ��
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept",FetchMode.JOIN)
				.createAlias("dept","d")
				.add(Restrictions.eq("d.deptName","��ʳ��"));
		//3��ͨ��criteria������ѯ�����в�ѯ
		List<Emp> list = criteria.list();
		//4���������
		for(Emp emp : list){
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
    }
}

