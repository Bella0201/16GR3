package com.qhit.lh.bella.t3.bean;

/**
 * @author �β���
 *TODO
 * 2017��12��13������9:46:49
 */
public class User implements java.io.Serializable {

	private Integer userId;
	private String userName;
	private String password;
	
	private Emp emp;

	public User() {
	}

	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}


	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
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

}
