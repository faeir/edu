package co.test;

import java.util.Scanner;

// 종합.
// 클래스의 인스턴스와 배열의 활용.
// 친구의 소중한 정보를 관리하는 앱을 구현하세요.
// Exam4(친구정보) 클래스의 인스턴스를 저장, 수정, 삭제, 조회 처리.
public class Exam5 {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		int menu = 0;
		while(run) {		
		System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.조회 | 5.종료");
		System.out.print("선택 >");
		menu = scn.nextInt();
		scn.nextLine();
		
		if (menu == 1) {
			Exam4.addFreind();
		} else if (menu == 2) {
			Exam4.changeInfo();
		} else if (menu == 3) {
			Exam4.delFreind();
		} else if (menu == 4) {
			Exam4.searchFreind();
		} else if (menu == 5) {
			run = false;
			System.out.println("프로그램 종료");
			break;
		}
	}
	}
}
	
