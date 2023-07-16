package com.abhi.stream8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write a program to generate a new list with only name of all the peoples in the list
		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee("abhinav",25,100000));
		l.add(new Employee("akshay",22,10000));
		l.add(new Employee("dagar",22,22000));
		l.add(new Employee("rakshit",23,90000));
		
		List<String> l1=l.stream().map((e)->e.getName()).collect(Collectors.toList());
		
		System.out.println("new list is "+l1);
	}

}
