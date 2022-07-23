package com.lamdaexpression;

public interface FuncInterface 
{
	// abstract method
	void abstractFun(int x);
	
	
	// default method					//lambda expression with one argument example
										//Lambda Expression only applicable in Functional Interface
	default void  normalFun()
	{
		System.out.println("Hello");
	}

}
