package com.abhi.stream8;

import java.util.ArrayList;
import java.util.List;

public class StreamEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //write a program to find the max salary
		
		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee("abhinav",25,100000));
		l.add(new Employee("akshay",22,10000));
		l.add(new Employee("dagar",22,22000));
		l.add(new Employee("rakshit",23,9000));
		
		l.stream().max((a,b)->a.getSalary()-b.getSalary()).stream().forEach((w)->System.out.println("maximum salary paid employee is "+w.getName()));
		
		l.stream().min((a,b)->a.getSalary()-b.getSalary()).stream().forEach((w)->System.out.println("minimum salary paid employee is "+w.getName()));
				
		
		
	}

}
