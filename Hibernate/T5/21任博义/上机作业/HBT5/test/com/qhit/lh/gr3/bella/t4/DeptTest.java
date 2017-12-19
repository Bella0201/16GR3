package com.qhit.lh.gr3.bella.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t4.bean.Dept;
import com.qhit.lh.gr3.bella.t4.bean.Emp;
import com.qhit.lh.gr3.bella.t4.bean.User;
import com.qhit.lh.gr3.bella.t4.servcie.BaseService;
import com.qhit.lh.gr3.bella.t4.servcie.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//创建部门
		Dept dept = new Dept();
		dept.setDeptName("体育部");
		//没有员工
		
		//有新员工
		Emp wyn = new Emp();
		wyn.setEmpName("王云纳");
		wyn.setEmpSex("F");
		wyn.setBirthday("1996-02-01");
		
		dept.getEmps().add(wyn);
		//do
		baseService.add(dept);
		}
			
	    @Test
		public void delete(){
			Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
				
			baseService.delete(dept);
		}
			
		@Test
		public void update(){
			Dept dept = (Dept) baseService.getObjectById(Dept.class, 5);
			dept.setDeptName("国务院");
				
			baseService.update(dept);
		}
			
		@Test
		public void query(){
			Dept dept = (Dept) baseService.getObjectById(Dept.class, 4);
				
			for(Emp emp:dept.getEmps()){
				System.out.println(dept.getDeptName()+":"+emp.getEmpName());
	  }
   }
}	
			
