import java.util.Arrays;
import java.util.Scanner;
public class tip8_16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[][] ary=new int[5][2];
		System.out.println("Enter a 5-by-2 matrix row by row:");
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				ary[i][j]=input.nextInt();		
			}
		}
		sort(ary);
		System.out.println("The sorted matrix is:");
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sort(int m[][]) {
		Arrays.sort(m, (arr1, arr2) -> arr1[1] == arr2[1] ? arr1[0] - arr2[0] : arr1[1] - arr2[1]);
	}
}
