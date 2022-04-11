package co.edu.variable;

import java.io.IOException;
import java.util.Scanner;

public class SystemExample {

	public static void main(String[] args) {
		// 표준입출력
		//Scanner scn = new Scanner("A B C"); // 키보드 입력
		
		//System.out.println("세게의 단어를 입력하세요, 예) 안녕하세요 감사해요 잘있어요");
		//while (scn.hasNext()) {
			//String str = scn.next();
			//System.out.println(str);
			//if (str.equals("exit")) {
				//break;}
				
		System.out.println("숫자를 입력하세요");
		while(true) {
			int readByte;
			try {
				readByte = System.in.read();
				System.out.println(readByte);
				if(readByte == 97)
					break;			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
		System.out.println("프로그램 종료" );
	
	}
}

