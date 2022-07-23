package com.java8features;

public class DefaultImplementationClass implements DefaultMethod,SecondDmethod
{
	public void print()
	{
		DefaultMethod.super.print();
		 SecondDmethod.super.print(); 
	}
	
	public static void main(String[] args) 
	{
		DefaultImplementationClass dic=new DefaultImplementationClass();
		dic.print();
		 
	}
	
		
	

}

