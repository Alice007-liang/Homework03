import java.util.Arrays;
public class tip8_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] answers= {
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','B','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}
		};
		char[] keys= {'D','B','D','C','C','D','A','E','A','D'};
		int [][] grades=new int[answers.length][2];
		for(int i=0;i<answers.length;i++) {
			int correctCount=0;
			//记录每位同学的序号和答对题数
			grades[i][0]=i;
			for(int j=0;j<answers[i].length;j++) {
				if(answers[i][j]==keys[j])
					correctCount++;
			}
			grades[i][1]=correctCount;
		}
		int[][] sorted = mySort(grades);
		for(int i=0;i<sorted.length;i++)
			System.out.println("Student "+sorted[i][0]+"'s correct count is "+sorted[i][1]);
	}
	public static int[][] mySort(int[][] array){
        Arrays.sort(array, (arr1, arr2) -> arr1[1] == arr2[1] ? arr1[0] - arr2[0] : arr1[1] - arr2[1]);
        return array;
    }

}
