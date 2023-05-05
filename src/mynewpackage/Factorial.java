package mynewpackage;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		long n=sc.nextInt();
		long fact=1;
		sc.close();
		for(long i=1;i<=n;i++) 
		{
			 fact=fact*i;	
		}	
		System.out.println(fact);//above 65 we can't get factorial value
	}
}
