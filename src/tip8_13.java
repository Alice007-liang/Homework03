import java.util.Scanner;
public class tip8_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns of the array: ");
		int row=input.nextInt();
		int column=input.nextInt();
		System.out.println("Enter the array:");
		double[][] ary=new double[row][column];
		for(int i=0;i<ary.length;i++)
			for(int j=0;j<ary[i].length;j++)
				ary[i][j]=input.nextDouble();
		int[] a=locateLargest(ary);
		System.out.print("The location of the largest element is at ("+a[0]+", "+a[1]+")");
	}
	//Locate the largest number
	public static int[] locateLargest(double[][] a) {
		int maxRow=0;
		int maxColumn=0;
		int[] locate=new int[2];
		double largest=a[maxRow][maxColumn];
		for(int i=0;i<a.length;i++)
			for (int j=0;j<a[i].length;j++)
				if(a[i][j]>largest) {
					maxRow=i;
					maxColumn=j;
				}
		locate[0]=maxRow;
		locate[1]=maxColumn;
		return locate;
	}
}
