package com.java.practice31;

public class ReverseAnArray {
public void reverseAnArray(int []a, int n) {
	System.out.print("reverse of given array: ");
	for(int i=n-1;i>=0;i--) {
		System.out.print(+a[i]+" ");
	}
	System.out.println("\n");
}
}
