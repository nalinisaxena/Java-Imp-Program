
import java.io.*;
import java.util.*;

class Main{

  public static void main(String args[]) throws Exception{
  
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(br.readLine());
  while(t-->0){
  
      String s[]=br.readLine().split(" ");
     String s1= s[0]; // [a,b,c,d, ,a,d,c,b]
     String s2= s[1];
      
     for(char c:s1.toCharArray()){
     	s2=s2.replaceFirst(""+c,"");
     	
     }
      if(s2.length()==0)
      System.out.println("YES");
      else
     System.out.println("NO");
  
  }
  
  }


}