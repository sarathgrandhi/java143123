package mynewpackage;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sort2 {

	public static void main(String[] args) {
		Object a[] = {1,3,8,7,6,9,4,2,5};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting:"+Arrays.toString(a));

	}

}
