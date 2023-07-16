package com.abhi.stream8;
import java.util.*;
public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//write a program to get the salary of person name starting with a
		
		
		List<Employee> l=new ArrayList<>();
		
		l.add(new Employee("abhinav",25,100000));
		l.add(new Employee("akshay",22,10000));
		l.add(new Employee("dagar",22,22000));
		l.add(new Employee("rakshit",23,90000));
		
		l.stream().filter((e)->e.getName().startsWith("a")).forEach((e)->System.out.println(e.getName()+" salary is "+e.getSalary()));

	}

}
