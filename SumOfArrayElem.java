package com.java.practice31;

public class SumOfArrayElem {
public void sumOfArrayEl(int a[],int n) {
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+a[i];
	}
	System.out.println("the sum of given array elements is: "+sum);
}
}
