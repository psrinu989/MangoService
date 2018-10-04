package com.srini;

interface InterF
{
	public void m();
}

public class Test {
public static void main(String[] args) {
	InterF d=() ->System.out.println("Hello Srini.....");
	
	
	d.m();
	
	d.m();
	d.m();
	d.m();
}
}
