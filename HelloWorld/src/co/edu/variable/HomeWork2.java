package co.edu.variable;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); 
		int balance, price, tex, change;
		
		System.out.println("금액을 지불해주세요 >");
		balance = scn.nextInt();
		System.out.println("가격을 입력해주세요 >");
		price = scn.nextInt();
		tex = price / 10;
		change = balance - price;
		
		System.out.println("[현금] " + balance);
		System.out.println("[물건가격] " + price);
		System.out.println("[부가세] " + tex);
		System.out.println("[잔돈] " + change);

	}

}
