package mynewpackage;

public class Array2d {

	public static void main(String[] args) {
		int[][] myValues= {{100,200},{300,400},{500,600}};
		for(int i=0;i<=myValues.length-1;i++) 
		{
			for(int j=0;j<=myValues[0].length-1;j++)
			{
				System.out.print(myValues[i][j] + ",");
				
			}
			System.out.println();
		}
		

	}

}
