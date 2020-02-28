package com.task3.epamtask3;

public class Calculator 
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		if(a<b)
		    return b-a;
		else
			return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		if(a<b&&a>0)
		    return b/a;
		else if(b<a&&b>0)
			return a/b;
		else
			return 0;
	}

	
}
