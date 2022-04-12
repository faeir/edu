package co.edu.loop;

import java.util.Scanner;

public class CountExample {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.print("선택> ");
			
			int menu = scn.nextInt();
					
			switch(menu) {			
			case 1:
				System.out.print("예금액 >");
				balance += scn.nextInt();
				break;
			case 2:
				System.out.print("출금액 >");
				if (balance >= scn.nextInt()) {
					balance -= scn.nextInt();
				} else if (balance - scn.nextInt == 0) {
					break;
				} else {	
					System.out.print("잔액이 부족합니다");					
				}break;
			case 3:
				System.out.print("현재 잔고 : " + balance);				
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
	System.out.println("종료");
	}
}