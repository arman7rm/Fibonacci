package Fibonnacci;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		System.out.println("Please enter an integer");
		int x= in.nextInt();
		
		
		System.out.println("The "+ x +"th sequence of the febonacci pattern is " + fib(x));
		in.close();
	}
	
	public static long fib(long n) {
	      if ((n == 0) || (n == 1))
	         return n;
	      else
	         return fib(n - 1) + fib(n - 2);
	   }

}
