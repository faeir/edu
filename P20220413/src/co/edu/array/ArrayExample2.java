package co.edu.array;

import javax.print.attribute.standard.MediaSize.Other;

public class ArrayExample2 {

	public static void main(String[] args) {
		int[] intAry = {10, 20, 30, 40, 50};
		int max = 0;
		int sum = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println(intAry[i]);
			if(max < intAry[i]) {
				max = intAry[i];
			}
			sum += intAry[i];
		}
		System.out.println("최대값 "+ max);
		System.out.println("합계 "+sum);
	}
}
