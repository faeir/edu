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
		int[] gAry2 = new int[5];
		System.out.println("칸을 선택해 주세요 >");
		while (true) {
			int choise = scn.nextInt();
			if (gAry[choise - 1] == 5) {
				for (int i = 0; i < gAry.length; i++) {
					System.out.print("[" + gAry[i] + "]");
				}
				break;
			} else {
				for (int j = 0; j < gAry2.length; j++) {
					if (j == choise - 1) {
						gAry2[j] = gAry[j];
						System.out.print("[" + gAry2[j] + "]");
					} else if (gAry2[j] != 0) {
						System.out.print("[" + gAry2[j] + "]");
					} else {
						System.out.print("[*]");
					}

				}
			}
		}
	}
}
