import java.util.Arrays;
public class tip8_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m= {{1,2},{3,4},{5,6},{7,8},{9,10}};
		shuffle(m);
		
	}
	public static void shuffle(int[][] m) {
		for(int p=0;p<m.length;p++) {
			for(int q=0;q<m[p].length;q++) {
				int a=(int)(Math.random()*(m.length));
				int b=(int)(Math.random()*(m[p].length));
				int temp=m[a][b];
				m[a][b]=m[p][q];
				m[p][q]=temp;
			}
		}
		for(int i=0;i<m.length;i++) {
			for(int j=0;j<m[i].length;j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();	
		}
			
			
	}
}
