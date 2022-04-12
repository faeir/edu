package co.edu.loop;

import java.util.Scanner;

public class HomeWokr2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int RoPS = (int)(Math.random() * 3) + 1;
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 선택해주세요 >");
		int player = scn.nextInt();
		
		switch(player) {
		
		case 1:
				System.out.println("가위를 내셨습니다");
			if (RoPS == 3) {
				System.out.println("상대방이 보를 내었습니다");
				System.out.println("승리하셨습니다");
			} else if (RoPS == 1) {
				System.out.println("상대방이 가위를 내었습니다");
				System.out.println("비겼습니다");
			} else {
				System.out.println("상대방이 바위를 내었습니다");
				System.out.println("패배했습니다");
			}
			break;
		case 2:
				System.out.println("바위를 내셨습니다");
			if (RoPS == 1) {
				System.out.println("상대방이 가위를 내었습니다");
				System.out.println("승리하셨습니다");
			} else if (RoPS == 2) {
				System.out.println("상대방이 바위를 내었습니다");
				System.out.println("비겼습니다");
			} else {
				System.out.println("상대방이 보를 내었습니다");
				System.out.println("패배했습니다");
			}
			break;
		case 3:
				System.out.println("보를 내셨습니다");
			if (RoPS == 2) {
				System.out.println("상대방이 바위를 내었습니다");
				System.out.println("승리하셨습니다");
			} else if (RoPS == 3) {
				System.out.println("상대방이 보를 내었습니다");
				System.out.println("비겼습니다");
			} else {
				System.out.println("상대방이 가위를 내었습니다");
				System.out.println("패배했습니다");
			}
			break;
		}
		System.out.println("게임을 종료합니다");
	}

}
