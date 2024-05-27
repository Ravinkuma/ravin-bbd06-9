package com.java.practice31;
import java.util.*;
public class Main_31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int n=sc.nextInt();
		System.out.println("enter element of array");
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		/*
		 *  TO GIVE USER INPUT IN SINGLE(SAME) LINE
		 * String inputLine = scanner.nextLine();

        // Split the input line into individual elements
        String[] elements = inputLine.split(" ");

        // Convert the string elements into integers
        int[] array = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            array[i] = Integer.parseInt(elements[i]);
        }
        */
        
        PrintArray obj=new PrintArray();
        obj.printArray(a, n);
        
        
		/*
        PrintArray.printArray(a ,n); if created a static method in base class, call using 
        ClassName.methodName(arguments if passes in base class)... some questions solved in 
         coding practice first package 
         */
        
        SumOfArrayElem obj2=new SumOfArrayElem();
        obj2.sumOfArrayEl(a, n);

		ReverseAnArray obj3=new ReverseAnArray();
		obj3.reverseAnArray(a, n);

	
		Student s1=new Student("Ravin",25);
		System.out.println("name is: "+s1.getName()+" and age is: "+s1.getAge());
		Student s2=new Student("mohit",24);
		System.out.println("name is: "+s2.getName()+" and age is: "+s2.getAge());
		Student s3=new Student("Raina",27);
		System.out.println("name is: "+s3.getName()+" and age is: "+s3.getAge());
		
		Employee e1=new Employee("Rohit",66666.25);
		System.out.println("name is: "+e1.getName()+" and salary is: "+e1.getSalary());
		Employee e2=new Employee("Ajay",67666.25);
		System.out.println("name is: "+e2.getName()+" and salary is: "+e2.getSalary());
		
		Students ss1=new Students("Ravin",25,07);
		ss1.printDetails();
		Students ss2=new Students("John",21,68);
		ss2.printDetails();
		Students ss3=new Students("Johny",22,99);
		ss3.printDetails();
	}

}
