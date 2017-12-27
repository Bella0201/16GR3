package com.qhit.lh.gr3.bella.t7;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.qhit.lh.gr3.bella.t7.bean.Dept;
import com.qhit.lh.gr3.bella.t7.bean.Emp;
import com.qhit.lh.gr3.bella.t7.bean.User;
import com.qhit.lh.gr3.bella.t7.service.BaseService;
import com.qhit.lh.gr3.bella.t7.service.impl.BaseServiceImpl;
import com.qhit.lh.gr3.bella.t7.utils.HibernateSessionFactory;

/**
 * @author 任博艺
 *2017年12月26日下午10:32:58
 * TODO
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();
	
	@Test
	public void add() {
		
		//招人
		Emp emp = new Emp();
		emp.setEmpName("天天");
		emp.setEmpSex("m");
		emp.setBirthday("2017-12-25");
		
		//分帐户
		User user = new User();
		user.setUserName("tiantian");
		user.setUserPassword("222222");
		user.setAddress("南京");
		
		//部门
	    Dept dept = (Dept) baseService.getObjectById(Dept.class, 14);
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		baseService.add(emp);
	}
	
	@Test
	public void query(){
		List<Object> list = baseService.getAll("from Emp");
		Emp emp ;
		for(Object object : list){
			emp =  (Emp) object;
			System.out.println(emp.toString());
		}
	}
	/**
	 * 根据姓名查询
	 * 
	 */
	@Test
	public void getEmpByName(){
		List<Emp> list = baseService.getEmpByName("%京%");
		
		for(Emp emp : list){
			System.out.println(emp.getEmpId()+":"+emp.getEmpName());
		}
	}
	/**
	 * 查询每个部门的员工人数，显示出部门信息和人数
	 */
	@Test
	public void getDeptInfo(){
		 //1，获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2，通过session对象创建criteria条件查询器
		Criteria criteria = session.createCriteria(Dept.class)
				.setFetchMode("emps",FetchMode.JOIN)
				.createAlias("emps","e");
		//设置分组条件和查询结果
		ProjectionList proList = Projections.projectionList()
				.add(Projections.groupProperty("deptId"))
				.add(Projections.groupProperty("deptName"))
				.add(Projections.groupProperty("address"))
				.add(Projections.count("e.eid"));
		//关联条件查询器和结果
		criteria.setProjection(proList);
		//3，通过criteria条件查询器进行查询
		List<Object[]> list = criteria.list();
		//4，遍历输出
		for(Object[] obj : list){
			System.out.println(""+obj[0]+obj[1]+obj[2]+obj[3]);
		}
	}


}
