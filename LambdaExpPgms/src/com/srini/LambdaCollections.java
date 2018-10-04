package com.srini;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaCollections {
public static void main(String[] args) {
	ArrayList<Integer> l=new ArrayList<Integer>();
	l.add(20);
	l.add(10);
	l.add(25);
	l.add(5);
	
	System.out.println("Array List Object :: "+l);
	
	Comparator<Integer> list=(i,j)->(i<j)?-1:(i>j)?1:0;
	
	Collections.sort(l,list);
	
	System.out.println("Sorted Array List : "+l);
}
}
 