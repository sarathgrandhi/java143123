package mynewpackage;

import java.util.Scanner;

public class Even_number {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n= sc.nextInt();
		System.out.println("Even numbers:");
		for(int i=m;i<=n;i++){
			if(i%2==0) {
				System.out.print(" " +i);
			}
			 
		}
		System.out.println();
		System.out.println("Enter a number :");
		int x=sc.nextInt();
		int y=sc.nextInt();
		sc.close();
		System.out.println("Odd numbers:");
		for(int i=x;i<=y;i++) {
			if(i%2!=0) {
				System.out.print(" " +i);
			}

		}

	}
}



