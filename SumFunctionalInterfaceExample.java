package com.jbvala.functionalinterface;

public class SumFunctionalInterfaceExample {
	
	public static void main(String[] args) {
		
		//SumFunctionalInterface sumFunctionalInterface = (num1, num2) -> num1 + num2;
		
		SumFunctionalInterface sumOfFunctionalInterface =(a,b)-> a+b;
		System.out.println(sumOfFunctionalInterface.sum(10, 20));
		
	}

}
