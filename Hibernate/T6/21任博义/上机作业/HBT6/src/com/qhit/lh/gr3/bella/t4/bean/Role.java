package com.qhit.lh.gr3.bella.t4.bean;

import java.util.HashSet;
import java.util.Set;

public class Role implements java.io.Serializable {

	// Fields

	private Integer roleId;
	private String roleName;
	private String memo;

	// Constructors
	//¶à¶Ô¶à
	private Set<User> users = new HashSet<>();

	public Role(String roleName, String memo) {
		super();
		this.roleName = roleName;
		this.memo = memo;
	}

	public Role(String roleName, String memo, Set<User> users) {
		super();
		this.roleName = roleName;
		this.memo = memo;
		this.users = users;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}