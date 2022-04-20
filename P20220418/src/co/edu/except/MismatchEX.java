package co.edu.except;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MismatchEX {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("1.추가 | 2.종료");
			System.out.println("선택 >>");
			int menu = 0;
			
			try {
				Class.forName("java.lang.String"); // Exception
			} catch (ClassNotFoundException e2) {
				e2.printStackTrace();
			}
			
			try {
			menu = Integer.parseInt(scn.next());//scn.nextInt(); // RuntimeException
			scn.nextLine();
			
			} catch (InputMismatchException | NumberFormatException e2) {
				System.out.println("숫자를 입력하세요");
				scn.next();
			} catch (ArrayIndexOutOfBoundsException e1) {
				System.out.println("범위초과");
			} catch (Exception e3) {
				System.out.println("알 수 없는 예외 발생");
			} finally {
				System.out.println("에외처리에서 반드시 한 번은 실행");
			}
			
			if (menu == 1) {
				System.out.println("추가작업");
			} else if (menu == 2) {
				break;
			}
		}
		System.out.println("end of prog");
	}
}
