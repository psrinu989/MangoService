package com.srini;
@FunctionalInterface
interface Inter
{
	public void add(int a,int b);
}
public class Test1 {
public static void main(String[] args) {
Inter i=(a,b)->System.out.println("The Sum of two variables a and b are "+(a+b));	
i.add(23, 49);
i.add(90, 87);
}
}
