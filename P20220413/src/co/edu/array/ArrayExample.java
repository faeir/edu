package co.edu.array;

import javax.print.attribute.standard.MediaSize.Other;

public class ArrayExample {

	public static void main(String[] args) {
		// 학생의 점수 30명.
		int score1 = 80;
		
		// 같은 유형의 여러 값을 저장
		int[] intAry = new int[30]; // 정수 [n]개를 담을 수 있는 공간 생성 
		
		intAry[0] = 30;
		intAry[4] = 40;
		intAry[29] = 55;
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		
		double[] dblAry = new double[10]; // double [n]개를 담을 수 있는 공간 생성
		
		String[] strAry = new String[5]; // 참조타입 변수의 기본값 => null
		System.out.println(strAry[0]);
		
		int[] otherAry = {10, 20, 30, 40}; //초기값 지정
		int[] otherAry2 = {10, 20, 30, 40}; 
		System.out.println(otherAry[0]);
		
		if(otherAry[0] == otherAry2[0]) {
			System.out.println("O");
		} else {
			System.out.println("X");			
		
		}
	}
}
