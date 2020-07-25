package com.test.project.java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class getPolindromeStrings {
	static List<String> polindrome(ArrayList<String> list)
	{
		List<String> resultlist=list
		.stream()
		.filter(i -> ispolindrome(i))
		.collect(Collectors.toList());
		
		return resultlist;
		
	}
	static boolean ispolindrome(String string1)
	{
		String string=string1.toLowerCase();
		return IntStream.range(0,string.length()/2)
				.allMatch(i -> string.charAt(i)==string.charAt(string.length()-i-1));
		
	}

}
