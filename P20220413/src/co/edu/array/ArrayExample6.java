package co.edu.array;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String[] names = new String[3]; //학생이름
		int[] score = new int[3]; //점수
		
		for (int i = 0; i <names.length; i++) {
			System.out.println("이름 입력 >");
			names[i] = scn.nextLine();
			
			System.out.println("점수 입력 >");
			score[i] = scn.nextInt();
			scn.nextLine();			
			// A B C
			// 10 20 30
		}
		System.out.println("조회할 학생 이름 >");
		String searchName = scn.nextLine();
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(searchName)) {
				System.out.println(searchName + "의 점수는 "+ score[i] +"점 입니다."); //
			}
		}
		System.out.println("종료");
	}
}
