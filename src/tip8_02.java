import java.util.Scanner;
public class tip8_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m=getArray();
		System.out.println("\nSum of the elements in the major diagonal is "+sumMajorDiagonal(m));
	}
	public static double[][] getArray(){
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter array values
		double[][] m = new double[4][4];
		System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
				m[i][j]=input.nextDouble();
		return m;
		
	}
	
	public static double sumMajorDiagonal(double[][] m) {
		double sum=0;
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[0].length;j++)
				if(i==j)
					sum+=m[i][j];
		return sum;
	}
	
}
