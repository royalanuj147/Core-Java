package Advance_java;

import java.util.ArrayList;
import java.util.List;

class student{
	int id;
	String name;
	int age;
	String city;
	
	// constructor
	public student(int id, String name, int age, String city) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}

	public class Array_List_3 {

	public static void main(String args[]) {
		student s1 = new student(1, "Anuj",20,"Ranchi");
		student s2 = new student(2, "shubham",40,"patna");
		student s3 = new student(3, "Rohan",18,"goa");
		student s4 = new student(4, "Neha",29,"Ranchi");
		student s5 = new student(5, "Pintu",44,"Tata");
		
		List<student> a = new ArrayList<student>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		a.add(s5);
		
		System.out.println(a);
		System.out.println(a.size());
	}
}
