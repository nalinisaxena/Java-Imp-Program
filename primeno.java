/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int rem;
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=2;i<=n/2;i++)
		{
		rem=n%i;
		if(rem==0)
		{
			flag=false;
			break;
		}
		
		}
		
		if(flag)
		System.out.println(n+ " is prime no  ");
		else
		System.out.println(n+ " is not prime no ");
		}
}