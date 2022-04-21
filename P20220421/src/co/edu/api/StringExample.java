package co.edu.api;

import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("주민번호를 입력해주세요 > ");
		String personNumber = scn.next();
		String jumin = checkInfo(personNumber);		
		
	}	
	public static String checkInfo(String jumin) {
		String year = jumin.substring(0, 2);
		System.out.print(year + "년 ");
		String mon = jumin.substring(2, 4);
		System.out.print(mon + "월 ");
		String day = jumin.substring(4, 6);
		System.out.print(day + "일생 ");
		char gender = jumin.charAt(6);
		char gender1 = jumin.charAt(7);
		while (true) {
			if (gender == '-') {
				gender = gender1;
			} else if (gender == '1') {
				System.out.println("남자입니다");
				break;
			} else if (gender == '2') {
				System.out.println("여자입니다");
				break;
			} else if (gender == '3') {
				System.out.println("남자입니다");
				break;
			} else if (gender == '4') {
				System.out.println("여자입니다");
				break;
			} else {
				System.out.println("유효한 주민번호가 아닙니다");
				break;
			}		
		}
		return null;
	}
}
