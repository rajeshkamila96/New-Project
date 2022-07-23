package com.lamdaexpression;

public class TestlamdaExpression //implements FuncInterface 
{

	public static void main(String[] args)
	{
		
		// Lambda expression to implements above functional interface . This interface by default implements abstractFun
		FuncInterface obj= (int x) -> System.out.println(2*x);
		obj.abstractFun(5);
		
		obj.normalFun();

	}
	/*public void abstractFun(int y)
	{
		System.out.println(y);
		
	}
*/
}
