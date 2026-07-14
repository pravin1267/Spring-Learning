package com.tca;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Student{
	private String name;
	private String city;
	private double per;
	
	public void Student() {}

	public Student(String name, String city, double per) {
		super();
		this.name = name;
		this.city = city;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + ", per=" + per + "]";
	}
	
	
}
public class App {
    public static void main(String[] args) {
       
      Student s1= new Student("Sachin","new Sangavi",80.5);
      Student s2 = new Student("Sourabh","old sangavi",99.5);
      
      Map<String,Student> hm = new HashMap<>();
      
      hm.put("sb-1", s1);
      hm.put("sb-2", s2);
      
      Student s = hm.get("sb-1");
      System.out.println(s);
      System.out.println("-----------------------------------------------");
      Set<Entry<String,Student>> set = hm.entrySet();
      
      for(Entry<String,Student> entry : set) {
    	  System.err.print("KEY : "+entry.getKey());
    	  System.out.println(" VALUE : "+entry.getValue());
      }
      
    }
}
