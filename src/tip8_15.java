import java.util.Scanner;
public class tip8_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] points=new double[5][2];
		for(int i=0;i<points.length;i++) {
			points[i][0]=input.nextDouble();
			points[i][1]=input.nextDouble();
		}	
		if(sameLine(points))
			System.out.println("The five points are on the same line");
		else
			System.out.println("The five points are not on the same line");
	}
	
	public static boolean sameLine(double[][] points) {
		int flag=1;
		double sum=0.0;
		for(int i=2;i<points.length;i++) {
			sum=(points[1][0]-points[0][0])*(points[i][1]-points[0][1])-(points[i][0]-points[0][0])*(points[1][1]-points[0][1]);
			if(sum!=0) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
}
