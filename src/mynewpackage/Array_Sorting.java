package mynewpackage;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		int a[]= {1,3,8,6,9,5};
		System.out.println("array before sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		// or Arrays.sort(a);
		System.out.println("Array after sorting:"+Arrays.toString(a));

	}

}
