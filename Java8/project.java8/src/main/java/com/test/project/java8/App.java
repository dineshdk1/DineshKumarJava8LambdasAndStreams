package com.test.project.java8;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner obj=new Scanner(System.in);
    	while(true)
    	{
    		System.out.println("Select one Method");
    		System.out.println("1:method that returns the average of a list of integers.");
    		System.out.println("2:method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters.");
    		System.out.println("3:method that returns a list of all the palindrome strings in a list");
    		System.out.println("0:exit");
    		System.out.println("Enter Your choice");
    		int ch=obj.nextInt();
    		if(ch==0)
    			break;
    		else if(ch==1)
    		{
    			ArrayList<Integer> list=new ArrayList<Integer>();
    			System.out.println("Enter size of List");
    			int n=obj.nextInt();
    			System.out.println("Enter numbers");
    			for(int i=0;i<n;i++)
    				list.add(obj.nextInt());
    			OptionalDouble avg=averageOfIntegers.average(list);
    			System.out.println("Average of list of Integers is "+avg.getAsDouble());
    			
    		}
    		else if(ch==2)
    		{
    			ArrayList<String> list=new ArrayList<String>();
    			System.out.println("Enter size of List");
    			int n=obj.nextInt();
    			System.out.println("Enter strings");
    			for(int i=0;i<n;i++)
    				list.add(obj.next());
    			List<String> resultlist=get3SizeStringsOfStartingWithA.startA3Letters(list);
    			for(String i:resultlist)
    				System.out.println(i);
    		}
    		else if(ch==3)
    		{
    			ArrayList<String> list=new ArrayList<String>();
    			System.out.println("Enter size of List");
    			int n=obj.nextInt();
    			System.out.println("Enter strings");
    			for(int i=0;i<n;i++)
    				list.add(obj.next());
    			List<String> resultlist=getPolindromeStrings.polindrome(list);
    			for(String i:resultlist)
    				System.out.println(i);
    		}
    		else
    		{
    			System.out.println("Enter correct choice");
    		}
    	}
    	obj.close();
    }
}
