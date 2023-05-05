package mynewpackage;

public class Array_2 {

	public static void main(String[] args) {
		int []a = {1,2,5,6,3,8,12,18,19,31,34};
		System.out.println("Even numbers in array:");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2==0) {
				System.out.print(" "+a[i]);
			}
		}
		System.out.println();
		System.out.print("Odd numbers in array:");
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]%2!=0) {
				System.out.print(" "+a[i]);
			}
		}

	}

}
