package com.qhit.lh.gr3.bella.t4.bean;
// default package

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User  implements java.io.Serializable {


    // Fields    

     private Integer userId;
     private String userName;
     private String password;

   //“ª∂‘“ª
 	private Emp emp;


    // Constructors

    /** default constructor */
    public User() {
    }

    
    /** full constructor */
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Emp getEmp() {
		return emp;
	}


	public void setEmp(Emp emp) {
		this.emp = emp;
	}
   
    // Property accessors
}