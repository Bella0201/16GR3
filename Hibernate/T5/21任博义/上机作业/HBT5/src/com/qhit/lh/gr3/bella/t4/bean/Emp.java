package com.qhit.lh.gr3.bella.t4.bean;
// default package

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp  implements java.io.Serializable {


    // Fields    

     private Integer eid;
     private String empName;
     private String birthday;
     private String empSex;
     private Integer deptId;
     
   //
 	private User user;
 	//∂‡∂‘“ª
 	private Dept dept;

    // Constructors

    /** default constructor */
    public Emp() {
    }

	/** minimal constructor */
    public Emp(String empName, String birthday, String empSex) {
        this.empName = empName;
        this.birthday = birthday;
        this.empSex = empSex;
    }
    
    /** full constructor */
    public Emp(String empName, String birthday, String empSex, Integer deptId) {
        this.empName = empName;
        this.birthday = birthday;
        this.empSex = empSex;
        this.deptId = deptId;
    }

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmpSex() {
		return empSex;
	}

	public void setEmpSex(String empSex) {
		this.empSex = empSex;
	}

	public Integer getDeptId() {
		return deptId;
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

    // Property accessors
}