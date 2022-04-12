package co.edu.loop;

import java.util.Scanner;

public class WhileExample2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		boolean isTrue = true;
		int sum = 0;
		while(isTrue) {
			System.out.println("숫자 입력 >");
			int num = scn.nextInt();
			sum += num; 
			if (sum > 200) {
				isTrue = false;
			}
		}
		System.out.println("결과 : " + sum);
	}
	
}

