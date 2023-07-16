package com.abhi.stream8;
import java.util.function.*;
public class StreamFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Consumer
		Consumer<Integer> c=(a)->System.out.println("this is consumer "+a);
		c.accept(12);
		
		//Function
		
		Function<Integer,Integer> f=(a)->a*a;
		System.out.println("this is function "+f.apply(11));
		
		
		//Predicate
		Predicate<Integer> p=(a)->a==12;
		
		System.out.println("this is a predicate "+p.test(13));
		
		
		//Supplier
		
		Supplier<Integer> sr=()->12;
		System.out.println("this is supplier "+sr.get());
		
		//BiFunction
		
		BiFunction<Integer,Integer,Integer> bf=(a,b)->a*b;
		
		System.out.println("this is a bifunction "+bf.apply(12, 2));

	}

}
