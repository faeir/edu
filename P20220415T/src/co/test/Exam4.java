package co.test;

import java.util.Scanner;

//클래스의 생성과 필드, 메소드, 생성자.
public class Exam4 {
	static Exam4[] freinds = new Exam4 [10];
	private static Scanner scn = new Scanner(System.in);
	// 친구의 이름, 생일, 연락처(중복값이 없는 키의 역할)
	
	private String frName;
	private String frBirth;
	private String frPhone;
	
	public Exam4(String frName, String frBirth, String frPhone) {
		super();
		this.frName = frName;
		this.frBirth = frBirth;
		this.frPhone = frPhone;
	}

	public String getFrName() {
		return frName;
	}

	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getFrBirth() {
		return frBirth;
	}

	public void setFrBirth(String frBirth) {
		this.frBirth = frBirth;
	}

	public String getFrPhone() {
		return frPhone;
	}

	public void setFrPhone(String frPhone) {
		this.frPhone = frPhone;
	}
	
	public static void addFreind() {
		System.out.print("친구 추가 >");
		String fNm = scn.next();
		System.out.print("생일 입력 >");
		String fBr = scn.next();
		System.out.print("전화 번호 >");
		String fPn = scn.next();
		
		for(int i = 0; i < freinds.length; i++) {
			if (freinds[i] == null) {
				freinds[i] = new Exam4(fNm, fBr, fPn);
				System.out.println("친구 등록 완료");
				break;
			}
		}
	}
	
	public static void changeInfo() {
		System.out.print("정보를 수정 하는 친구의 이름 >");
		String cFin = scn.next();
		System.out.print("생일 날짜 변경 >");
		String cFbir = scn.next();
		System.out.print("전화 번호 변경 >");
		String cFph = scn.next();
		
		for(int i = 0; i < freinds.length; i++) {
			if (freinds[i].getFrName().equals(cFin)) {
				freinds[i].setFrBirth(cFin);
				freinds[i].setFrPhone(cFph);
				System.out.println("정보가 변경 되었습니다.");
				break;
			}
		}
	}
	
	public static void delFreind() {
		System.out.print("삭제할 친구 이름 >");
		String dFr = scn.next();	
		
		for(int i = 0; i < freinds.length; i++) {
			if (freinds[i].getFrName().equals(dFr)) {
				freinds[i] = null;
				System.out.println("친구 정보 삭제");
				break;
			}
		}
	}
	
	public static void searchFreind() {
		System.out.print("검색할 친구 이름 >");
		String sFr = scn.next();
		
		for(int i = 0; i < freinds.length; i++) {
			if (freinds[i].getFrName().equals(sFr)) {
				System.out.println("이름 : "+ freinds[i].frName + " / 생일 : "//
									+ freinds[i].frBirth //
									+ " / 전화번호 : " + freinds[i].frPhone);
				break;
			}
		}
	}
}