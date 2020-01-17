package hackerrank;

import java.util.Scanner;

public class Palindrome {
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String reverse="";
        for(int i=A.length()-1;i>=0;i--)
        {
            reverse=reverse+=A.charAt(i);
        }
        if(A.compareTo(reverse)==0)
        {
            System.out.println("Yes");
        }
        else
        System.out.println("No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}
