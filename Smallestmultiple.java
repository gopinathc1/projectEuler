package com.java;

public class Smallestmultiple {

	/**
	 * @param args
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean gotResult=false;
		int i=21;

		while(!gotResult)
		{
			for(int j=1;j<=20;j++)
			{
				if(i%j==0)
				{
					gotResult=true;	
				}
				else
				{
					gotResult=false;	
					break;
				}
			}
			if(!gotResult)
			i++;
			else
				break;
			
		}
		System.out.println("Smallest +ve number>"+i);
			
	}

}
