package com.java8features;

public class ClassDemo implements Interface1
{
	static void hello()
	{
		System.out.println("Implementation static method here");
	}
	public static void main(String[] args) 
	{
		ClassDemo cd=new ClassDemo(); 
		Interface1.hello();
		cd.show("How are you ovverride show method");
		ClassDemo.hello();
	}
	
	public void show(String s)
	{
		System.out.println(s);
	}
}