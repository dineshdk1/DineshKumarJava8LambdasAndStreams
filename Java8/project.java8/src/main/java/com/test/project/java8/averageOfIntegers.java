package com.test.project.java8;
import java.util.*;
public class averageOfIntegers {
	static OptionalDouble average(ArrayList<Integer> list)
	{
		
		
		OptionalDouble avg=list
				.stream()
				.mapToDouble(x -> x)
				.average();
		return avg;
	}

}
