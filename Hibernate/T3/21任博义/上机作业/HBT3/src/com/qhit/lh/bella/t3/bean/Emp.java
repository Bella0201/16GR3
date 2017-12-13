package com.qhit.lh.bella.t3.bean;

/**
 * @author 任博义
 *TODO
 * 2017年12月13日下午9:44:54
 */
public class Emp implements java.io.Serializable{
	
	   // Fields
		private Integer eid;
		private String empName;
		private String empSex;
		private String birthday;
		private Integer deptId;
		//一对一的关联
		private User user;
		//多对一的关联
		private Dept dept;

		// Constructors

		public Emp() {
		}

		public Emp(String empName, String empSex, Integer deptId) {
			this.empName = empName;
			this.empSex = empSex;
			this.deptId = deptId;
		}

		public Emp(String empName, String empSex, String birthday, Integer deptId) {
			this.empName = empName;
			this.empSex = empSex;
			this.birthday = birthday;
			this.deptId = deptId;
		}

		// Property accessors

		public Integer getEid() {
			return this.eid;
		}

		public void setEid(Integer eid) {
			this.eid = eid;
		}

		public String getEmpName() {
			return this.empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public String getEmpSex() {
			return this.empSex;
		}

		public void setEmpSex(String empSex) {
			this.empSex = empSex;
		}

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public Integer getDeptId() {
			return this.deptId;
		}

		public void setDeptId(Integer deptId) {
			this.deptId = deptId;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Dept getDept() {
			return dept;
		}

		public void setDept(Dept dept) {
			this.dept = dept;
		}
		
		@Override
		public String toString() {
			return "Emp [eid=" + eid + ", empName=" + empName + ", empSex="
					+ empSex + ", birthday=" + birthday + ", deptId=" + deptId
					+ ", user=" + user + ", dept=" + dept + "]";
		}
	}

