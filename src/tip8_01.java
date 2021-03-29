import java.util.Scanner;
public class tip8_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] m=getArray();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number of column: ");
		int col=input.nextInt();
		System.out.println("\nSum of the elements at column "+col+" is "+sumColumn(m,col));
		
	}
	public static double[][] getArray(){
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Enter array values
		double[][] m = new double[3][4];
		System.out.println("Enter a " + m.length + "-by-" + m[0].length + " matrix row by row: ");
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
				m[i][j]=input.nextDouble();
		return m;
		
	}
	
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum=0;
		for(int i=0;i<m.length;i++)
			sum+=m[i][columnIndex-1];
		return sum;
	}
}
