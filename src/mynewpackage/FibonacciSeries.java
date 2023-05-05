package mynewpackage;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A value :");
		int a=sc.nextInt();
		System.out.println("Enter B value :");
		int b=sc.nextInt();
		System.out.println("Fibonacci series :");
		int c=a+b;
		sc.close();
		while(c<=100) {
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
			
		}

	}

}
