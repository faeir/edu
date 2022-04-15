package co.edu.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountApp {
	static Account[] accounts = new Account[100]; // 계좌정보 저장 배열.
	static Scanner scn = new Scanner(System.in);
	
	public void execute() {
		boolean run = true;
		while (true) { 
			System.out.println("1.계좌생성 | 2.입금 | 3.출금 | 4.목록조회 | 5.종료");
			
			int menu = 0;
				menu = scn.nextInt();
				scn.nextLine();
				
			if(menu == 1) {
				createAccount();								
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {
				withdraw();
			} else if (menu == 4) {
				accountList();
			} else if (menu == 5) {
				run = false;
				System.out.println("종료합니다");
				break;
				
			}
		}
		
	}
	//계좌 생성 실행 메소드
	public static void createAccount() {
		System.out.print("계좌번호 입력 >");
		String aNo = scn.next();
		System.out.print("예금주 입력 >");
		String aName = scn.next();
		System.out.print("잔액 입력 >");
		int money = scn.nextInt();
		
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null && accounts[i].getAcNo().equals(aNo)) {
				System.out.println("중복된 계좌번호가 존재합니다.");
				break;
			}
			if (accounts[i] == null) {
				accounts[i] = new Account(aNo, aName, money);
				System.out.println("계좌 생성 완료");
				break;
				}
			}
		}
	//입금처리
	public static void deposit() {
		System.out.print("입금할 계좌 선택 >");
		String dNo = scn.next();
		System.out.print("입금할 금액 입력 >");
		int plus = scn.nextInt();
		if(findAc(dNo) == null) {
			System.out.println("해당하는 계좌 정보가 없습니다.");
		} else {findAc(dNo).setBalance(findAc(dNo).getBalance() + plus);
				System.out.println("입금완료");
			
		}
		
	}	
	
	//출금처리
	public static void withdraw() {
		System.out.print("출금할 계좌 선택 >");
		String wNo = scn.next(); 
		System.out.print("출금할 금액 입력 >");
		int minu = scn.nextInt();
		if(findAc(wNo) == null) {
			System.out.println("해당하는 계좌 정보가 없습니다.");
		} else if (findAc(wNo).getBalance() < minu) { 
			System.out.println("잔액이 부족합니다.");			
		} else {
			findAc(wNo).setBalance(findAc(wNo).getBalance() + minu);
			System.out.println("출금완료");
		}
	}
	//목록
	public static void accountList() {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				break;
			}
		System.out.println("계좌번호 : " + accounts[i].getAcNo()//
				+ " / 예금주 : " + accounts[i].getAcName() + " / 예금액 : "+ accounts[i].getBalance());
		}
	}
	//예금주 검색
	public static Account findAc(String acNo) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAcNo().equals(acNo)) {
				return accounts[i];
			}
		}
		return null;
	}
}	