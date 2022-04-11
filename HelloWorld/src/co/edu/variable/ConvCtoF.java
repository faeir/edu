package co.edu.variable;

import java.util.Scanner;

public class ConvCtoF {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double c;
		int f;
		
		System.out.println("화씨를 입력해주세요");
		f = scn.nextInt();
		c = 5/9.0 * (f - 32);
	    
	    System.out.printf("화씨온도는 %2d 섭시온도는 %.2f", f, c);

	}

}
