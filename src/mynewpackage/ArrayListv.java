package mynewpackage;

import java.util.ArrayList;

public class ArrayListv {

	public static void main(String[] args) {

		ArrayList<String> myCars= new ArrayList<String>();
		myCars.add("Benz");
		myCars.add("BMW");
		System.out.println(myCars);
		myCars.add("Audi");
		System.out.println(myCars);
		myCars.add(1,"Jaguar");
		System.out.println(myCars);
		myCars.set(0, "KIA");
		System.out.println(myCars);
		myCars.remove(0);
		System.out.println(myCars);
		myCars.clear();
		System.out.println(myCars);

	}
}


