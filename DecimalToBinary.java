/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner in =new Scanner(System.in);
System.out.print("Enter decimal number");
int n=in.nextInt();
StringBuffer sb=new StringBuffer();
int num=n;
while(num>=1)
{
if(n%2!=0)
{
sb.append(1);
}
else if(n%2==0)
{
sb.append(0);
}
num=num/2;
}
System.out.println(sb.reverse());
}
}
	