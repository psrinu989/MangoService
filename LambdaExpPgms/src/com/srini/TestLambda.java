package com.srini;

@FunctionalInterface
interface intera
{
	public void m1();

	default void m2() {
		System.out.println("Default Method of Interface....");
	}

	public static void m3() {
		System.out.println("Static Method of Interface.....");
	}
}


public class TestLambda {
	public static void main(String[] args) {

	}
	
}
