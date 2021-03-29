
public class tip8_10 {

	public static void main(String[] args) {
		//generate random array
		int[][] ary=new int[4][4];
		for(int i=0;i<ary.length;i++) {
			for(int j=0;j<ary[i].length;j++) {
				ary[i][j]=(int)(Math.random()*2);
				System.out.print(ary[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("The largest row index: "+getMaxRow(ary));
		System.out.println("The largest column index: "+getMaxColumn(ary));
	}
	//Get the column with the most 1
	public static int getMaxColumn(int[][] array) {
		int maxColumn=0;
		int indexOfMaxColumn=0;
		//Get sum of the first column in maxColumn
		for(int row=0;row<array.length;row++) {
			maxColumn+=array[row][0];
		}
		for(int column=1;column<array[0].length;column++) {
			int totalOfThisColumn=0;
			for(int row=0;row<array.length;row++)
				totalOfThisColumn+=array[row][column];
			if(totalOfThisColumn>maxColumn) {
				maxColumn=totalOfThisColumn;
				indexOfMaxColumn=column;
			}
		}
		return indexOfMaxColumn;
	}
	
	
	//Get the row with the most 1
	public static int getMaxRow(int[][] array) {
		int maxRow=0;
		int indexOfMaxRow=0;
		//Get sum of the first row in maxRow
		for(int column=0;column<array[0].length;column++) {
			maxRow+=array[0][column];
		}
		for(int row=1;row<array.length;row++) {
			int totalOfThisRow=0;
			for(int column=0;column<array[row].length;column++)
				totalOfThisRow+=array[row][column];
			if(totalOfThisRow>maxRow) {
				maxRow=totalOfThisRow;
				indexOfMaxRow=row;
			}
		}
		return indexOfMaxRow;
	}
}
