package com.qhit.lh.bella.t1.bean;
/**
 * 
 * @author �β���
 *TODO
 * 2017��12��11������3:53:12
 */
public class Dept {
	private int id;
	private String name;
	public Dept(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
