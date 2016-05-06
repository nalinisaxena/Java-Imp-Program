/**

Problem Description 
Golu wants to find out the sum of Lucky numbers.Lucky numbers are those numbers which contain exactly two set bits.This task is very diffcult for him.So Help Golu to find sum of those numbers which exactly contain two set bits upto a given number N.

3 5 10 are lucky numbers where 7 14 are not.

INPUT

First line contain number of test cases T.Each test case contains a single number N.
OUTPUT

Print sum of all numbers upto N.Output may be large so take modulo with 1000000007.

Constraints

1<=T<=105
1<=N<=1018

NOTE: Since value of test cases and n is really large, please use fast I/O optimization techniques.

Sample Input(Plaintext Link)
 1
5
Sample Output(Plaintext Link)
 8
 
 1
 10
 11 =>3
 100
 101 => 5
 
 3+5=8
 


*/

// Write  code here

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfNumbers {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            System.out.println(ans(n));

        }
        // Set<Character> set=new HashSet();

    }

    private static long ans(int n) {
        long sum = 0;
        long mod = 1000000007L;
        for (int i = 3; i <= n; i++) {
            if (countSetBits(i) == 2) {
                sum += i;
            }
        }

        return sum % mod;

    }

    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
        
            n =n & (n - 1); // logical AND of n and n-1 3(11) & (10) 10 &(1) 1
            // 5(101)&(100)=>100&11=>10&1=>1&0
             count++;
        }
        return count;
    }

}
