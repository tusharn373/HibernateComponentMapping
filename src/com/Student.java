package com;

public class Student {
	int rollno;
	String name;
	float result;
	Address addr;
	public Student () {}
	public Student(int rollno, String name, float result, Address addr) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.result = result;
		this.addr = addr;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", result=" + result + ", addr=" + addr + "]";
	}
	

}
