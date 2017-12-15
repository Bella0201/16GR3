package com.qhit.lh.gr3.bella.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.gr3.bella.t4.bean.Dept;
import com.qhit.lh.gr3.bella.t4.bean.Emp;
import com.qhit.lh.gr3.bella.t4.servcie.BaseService;
import com.qhit.lh.gr3.bella.t4.servcie.impl.BaseServiceImpl;

public class DeptTest {
	private BaseService baseService = new BaseServiceImpl();
	@Test
	public void add() {
		//��������
		Dept dept = new Dept();
		dept.setDeptName("ѧϰ��");
		//û��Ա��
		
		//����Ա��
		Emp lfy = new Emp();
		lfy.setEmpName("�԰");
		lfy.setEmpSex("F");
		lfy.setBirthday("1997-08-01");
				
		dept.getEmps().add(lfy);
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
			dept.setDeptName("����Ժ");
				
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
			
