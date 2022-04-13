package co.edu.dimension;

import java.util.Scanner;

public class ArrayExample3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				
		int num1, num2, num3;
		System.out.println("첫번째 값 입력");
		num1 = scn.nextInt();
		System.out.println("두번째 값 입력");
		num2 = scn.nextInt();
		System.out.println("세번째 값 입력");
		num3 = scn.nextInt();
		
		int[] intAry = { num1, num2, num3};
		
		for (int j = 0; j < intAry.length -1; j++)
			for (int i = 0; i < intAry.length - 1; i++) {
				if(intAry[i] < intAry [i+1]) {
					int temp = intAry[i];
					intAry[i] = intAry[i+1];
					intAry[i+1] = temp;
			}
		}
		
		System.out.println(intAry[0] + "," +intAry[1]+ "," +intAry[2]);
	}
}