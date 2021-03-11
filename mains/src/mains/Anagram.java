package mains;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {

		String strg1= "Mother in lap ".toLowerCase();
		String strg2= "Hitler woman".toLowerCase();
		
		String str1 =(removeSpace(strg1));
		System.out.println("Length of str 1 = "+str1.length());
	    String str2 =(removeSpace(strg2));
	    System.out.println("Length of str 2 = "+str2.length());
		
	    if(str1.length()==str2.length()) {
		ArrayList<Character> ll1 = new ArrayList<Character>();
		
		for(int  i=0;i<str1.length();i++)
		{
			ll1.add(str1.charAt(i));
			
		}
		Collections.sort(ll1);
		System.out.println("The Linked list is - "+ll1);
ArrayList<Character> ll2 = new ArrayList<Character>();
		
		for(int  i=0;i<str2.length();i++)
		{
			ll2.add(str2.charAt(i));
			
		}
		Collections.sort(ll2);
		System.out.println("The Linked list is - "+ll2);
		
		int counter =0;
		
		boolean isequal=ll1.equals(ll2);// This can be the test
		
		//System.out.println("IS equal "+ isequal);
		for(int i=0;i<ll2.size();i++)
		{
			if(ll2.get(i)==ll1.get(i))
			{
				counter++;
			}
		}
		System.out.println();
		
	    if(counter==ll1.size())
	    {
	    	System.out.println("Anagram");
	    }
	    else {
	    	System.out.println("Not an anagram");
	    }
	    
	   
		}
		else
	    {
	    	System.out.println("Not an anagram");
	    }
	}
	
	static public String removeSpace(String str)
	{
		String s = "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				
			}
			else {
				s=s+str.charAt(i);
			}
		}
		
		return s;
	}

}
