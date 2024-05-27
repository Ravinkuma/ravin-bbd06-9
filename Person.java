package com.java.practice31;

public class Person {
   String name;
   int age;
public Person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
   public void printDetails() {
	   System.out.print("Name: "+name+", age: "+age+", ");
}
}
