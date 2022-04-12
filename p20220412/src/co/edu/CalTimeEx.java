package co.edu;

import java.util.Scanner;

public class CalTimeEx {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("초를 입력하세요.");
		int time = scn.nextInt();
		// 시, 분, 초 => 5000초 : 5000/(60*60) => 시
		// 5000%(60*60) => 1400/60 => 분
		// 1400%60 => 초
		
		int hour, minute, secs;
		hour = time/(60 * 60);
		time = time % (60 * 60);
		minute = time / 60;
		time = time % 60;
		secs = time;
		
		System.out.printf("%2d시간 %2d분 %2d초", hour, minute, secs);
		
	}

}