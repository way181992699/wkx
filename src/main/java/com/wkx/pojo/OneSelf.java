package com.wkx.pojo;

public class OneSelf {
	private Integer id;
	private String name;
	private String password;
	private String sex;
	private Integer age;

	public OneSelf() {
		super();
	}
	
	public OneSelf(Integer id, String name, String password, String sex, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.sex = sex;
		this.age = age;
	}

	@Override
	public String toString() {
		return "OneSelf [id=" + id + ", name=" + name + ", password=" + password + ", sex=" + sex + ", age=" + age
				+ "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
