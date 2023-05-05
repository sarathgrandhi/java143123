package mynewpackage;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int dayNo;
		String day=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number from 1to7 :" );
		dayNo=sc.nextInt();
		sc.close();		
		switch(dayNo)
		{
		
		case 1:
			day="Sunday";
			break;
		case 2:
			day="Monday";
			break;
		case 3:
			day="Tuesday";
			break;
		case 4:
			day="Wednesday";
			break;
		case 5:
			day="Thrusday";
			break;
		case 6:
			day="Firday";
			break;
		case 7:
			day="Saturday";
			break;
		default:
			 System.out.println("invalid number");
			//day="invalid day";
			System.exit(dayNo);
		}
		System.out.println(day);
	}
}
