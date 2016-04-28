/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number");
		int n=sc.nextInt();
		String fact=factorial(n);
		System.out.println("Factorial is"+ fact);
	}
	
	public static String factorial(int n)
	{
		BigInteger fact=new BigInteger("1");
		
		for(int i=1;i<=n;i++)
		{
			fact=fact.multiply(new BigInteger(i + " "));
		}
		return fact.toString();
	}

	}