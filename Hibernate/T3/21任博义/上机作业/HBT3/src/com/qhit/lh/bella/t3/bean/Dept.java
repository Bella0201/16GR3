package com.qhit.lh.bella.t3.bean;

/**
 * @author 任博义
 *TODO
 * 2017年12月13日下午8:38:54
 */
public class Dept implements java.io.Serializable {
	
	// Fields

		private Integer deptId;
		private String deptName;
		private String address;

		// Constructors

		/** default constructor */
		public Dept() {
		}

		/** minimal constructor */
		public Dept(String deptName) {
			this.deptName = deptName;
		}

		/** full constructor */
		public Dept(String deptName, String address) {
			this.deptName = deptName;
			this.address = address;
		}

		// Property accessors

		public Integer getDeptId() {
			return this.deptId;
		}

		public void setDeptId(Integer deptId) {
			this.deptId = deptId;
		}

		public String getDeptName() {
			return this.deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}
