/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int prev,next,sum;
		prev=next=1;
		for(int n=1;n<=10;n++)
		{
			     System.out.println(prev);
			     sum=prev+next;
			     
			     prev=next;
			     next=sum;
			     
			     
		}
	}
}