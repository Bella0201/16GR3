package com.qhit.lh.gr3.bella.t4.bean;

import java.util.HashSet;
import java.util.Set;

// default package

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept  implements java.io.Serializable {


    // Fields    

     private Integer deptId;
     private String deptName;
     private String address;
     
   //Ò»¶Ô¶à
 	private Set<Emp> emps = new HashSet<Emp>();

    // Constructors

    /** default constructor */
    public Dept() {
    }

    
    /** full constructor */
    public Dept(String deptName, String address) {
        this.deptName = deptName;
        this.address = address;
    }

   
    // Property accessors

    public Dept(String deptName, String address, Set<Emp> emps) {
		super();
		this.deptName = deptName;
		this.address = address;
		this.emps = emps;
	}
    
    

	public Dept(Integer deptId, String deptName, String address, Set<Emp> emps) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
		this.emps = emps;
	}


	public Integer getDeptId() {
		return deptId;
	}


	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Set<Emp> getEmps() {
		return emps;
	}


	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}
}