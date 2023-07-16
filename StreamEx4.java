package com.abhi.stream8;

import java.util.ArrayList;
import java.util.List;

public class StreamEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<>();
		l.add("abhi");
		l.add("abhinav");
		l.add("abhinav choudhary");
		
		
		List<String> l1=new ArrayList<>();
		l1.add("akki");
		l1.add("akshay");
		l1.add("akshay choudhary");
		
		List<List<String>> l3=new ArrayList<>();
		
		
		l3.add(l);
		l3.add(l1);
		
		l3.stream().flatMap((i)->i.stream()).forEach((e)->System.out.println(e));
	}

}
