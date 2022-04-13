package co.edu.dimension;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[][] intAry = new int[5][5]; 
		int num = 1; 
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				intAry[i][j] = num ++; 
				System.out.printf("%3s",intAry[i][j]);
				if (intAry[i][j] % 5 == 0) {
					System.out.println();
				}
			}
		}
	}
}