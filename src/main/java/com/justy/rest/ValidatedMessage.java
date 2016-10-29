package com.justy.rest;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.ObjectError;

 
public class ValidatedMessage {
	
	

	@NotEmpty(message="Name missing")
	private String name;
	 
	
	@Range(min=18,max=50,message="Age between 18 and 50")
	private Integer age;
	 
 private List<ObjectError>errors;
	public List<ObjectError> getErrors() {
	return errors;
}
public void setErrors(List<ObjectError> errors) {
	this.errors = errors;
}
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private int statuscode;
    
	public int getStatuscode() {
		return statuscode;
	}
	
	public void setStatuscode(int statuscode) {
		this.statuscode = statuscode;
	}
	//	@Enum(enumClass=Gender.class,ignoreCase=true)
//	private Gender sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
@Override
	public String toString() {
		return "ValidatedMessage [name=" + name + ", age=" + age + "]";
	}
	
}
