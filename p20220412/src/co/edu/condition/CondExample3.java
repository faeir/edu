package co.edu.condition;

import java.util.Scanner;

public class CondExample3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int RoPS = (int)(Math.random() * 3) + 1;
		int player = scn.nextInt();
				
		System.out.println(RoPS);
		
		switch(player) {
		case 1:
			if (RoPS == 2) {
				System.out.println("승리하셨습니다");
			} else if (RoPS == 1) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("패배했습니다");
			}
			break;
		case 2:
			if (RoPS == 3) {
				System.out.println("승리하셨습니다");
			} else if (RoPS == 2) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("패배했습니다");
			}
			break;
		case 3:
			if (RoPS == 1) {
				System.out.println("승리하셨습니다");
			} else if (RoPS == 3) {
				System.out.println("비겼습니다");
			} else {
				System.out.println("패배했습니다");
			}
			break;
		}
		System.out.println("게임을 종료합니다");
	}

}
