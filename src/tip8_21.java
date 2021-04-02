import java.util.Scanner;
public class tip8_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of cities: ");
		int num=input.nextInt();
		System.out.println("Enter the coordinates of the cities: ");
		double[][] ary=new double[num][2];
		for(int i=0;i<ary.length;i++)
			for(int j=0;j<ary[i].length;j++)
				ary[i][j]=input.nextDouble();
		double min=totalDistance(ary,0);
		int index=0;
		for(int i=0;i<ary.length;i++) {
			double total=totalDistance(ary,i);
			if(min>total) {
				min=total;
				index=i;
			}
		}
		System.out.println("The central city is at ("+ary[index][0]+", "+ary[index][1]+")");
		System.out.printf("The total distance to all other cities is %4.2f",min);
	}
	public static double totalDistance(double[][] coor,int i) {
		double totalDistance=0;
		for(int j=0;j<coor.length;j++)
			totalDistance+=distance(coor[i],coor[j]);
		return totalDistance;
	}
	public static double distance(double[] c1,double[] c2) {
		return Math.sqrt((c1[0]-c2[0])*(c1[0]-c2[0])+(c1[1]-c2[1])*(c1[1]-c2[1]));
	}
}
