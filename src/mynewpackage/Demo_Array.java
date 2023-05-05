package mynewpackage;

public class Demo_Array {

	public static void main(String[] args) {
		String[] myCars= new String[4];
		myCars[0]="Audi";
		myCars[1]="Benz";
		myCars[2]="BMW";
		myCars[3]="Suziki";
		System.out.println("Numbers of values in Array:" + myCars.length);
		System.out.println(myCars[0]);
		
		System.out.println("*********");
		for(int i=0;i<4;i++) {
			System.out.println(myCars[i]);
		}
		
	}
	

}

