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
@Test
public void getEmpLikeName() {
	    //1，获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2，通过session对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.add(Restrictions.like("empName", "%天%"));
		//3，通过criteria条件查询器进行查询
		List<Emp> list = criteria.list();
		//4，遍历输出
		for(Emp emp : list){
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
}
@Test
public void getEmpByDeptName() {
	    //1，获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2，通过session对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Emp.class)
				.setFetchMode("dept",FetchMode.JOIN)
				.createAlias("dept","d")
				.add(Restrictions.eq("d.deptName","零食部"));
		//3，通过criteria条件查询器进行查询
		List<Emp> list = criteria.list();
		//4，遍历输出
		for(Emp emp : list){
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
    }
}

