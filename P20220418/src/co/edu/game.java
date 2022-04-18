package co.edu;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] gAry = new int[5];

		for (int i = 0; i < gAry.length; i++) {
			int random = (int) (Math.random() * 5) + 1;
			gAry[i] = random; // 랜덤값이 0번에 입력
			for (int j = 0; j < i; j++) {
				if (gAry[i] == gAry[j]) {// (gAry[i](현재 입력된 값) == gAry[j](이전에 입력된 값)을 비교하는 코드
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("칸을 선택해 주세요 >");
			int choise = scn.nextInt();

			for (int j = 0; j < 5; j++) {
				if (j == choise - 1) {
					System.out.print("[" + gAry[i] + "]");
				} else {
					System.out.print("[*]");
				}
			}
		}

	}
}
