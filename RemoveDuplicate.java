import java.util.*;
import java.lang.*;
import java.io.*;

class RemoveDuplicates {
 public static void main(String[] args) throws java.lang.Exception {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter the words");
  String s = br.readLine();
  int l = s.length();
  char ch;
  String ans = "";
  for (int i = 0; i < l; i++) {
   ch = s.charAt(i);
   if (ch != ' ')
    ans = ans + ch;
   s = s.replace(ch, ' ');
  }
  System.out.println("word after removing duplicate chartecter" + ans);

 }
}