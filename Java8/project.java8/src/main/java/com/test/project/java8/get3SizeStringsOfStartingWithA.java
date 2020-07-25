package com.test.project.java8;

import java.util.*;
import java.util.stream.Collectors;

public class get3SizeStringsOfStartingWithA {
	static List<String> startA3Letters(ArrayList<String> list)
	{
		List<String> resultlist=list
				.stream()
				.filter(x -> x.charAt(0)=='a')
				.filter(x -> x.length()==3)
				.collect(Collectors.toList());
		return resultlist;
	}

}
