package com.srini;

class MyThread implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread :: "+i);
		}
	}
}

public class LambdaThread {
public static void main(String[] args) {
	
	MyThread mt=new MyThread();
	
	Runnable lambdaThread=()->{   
		
		
			for(int i=0;i<10;i++)
			{
				System.out.println("Lambda Thread :: "+i);
			}
		
		
		
	};
	
	Thread childThread=new Thread(mt);
	
	childThread.start();
	Thread lThread=new Thread(lambdaThread);
	
	lThread.start();
	
	for(int i=0;i<5;i++)
	{
		System.out.println("Parent Thread :: "+i);
	}
	
}
}
