package cd.edu;

import java.util.Scanner;

public class MemberExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Member m1 = new Member("user1", "사용자1", "010-1234-4567", 20);
		m1.setMemAge(-25);
		m1.setMemID("user01");
//		System.out.println(m1.getMemAge());
//		System.out.println(m1.getMemID());
//		m1.showInfo();
		
		Member[] members = new Member[3];
		
		for(int i = 0 ; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이를 입력해주세요");			
			String id = scn.next();
			String name = scn.next();
			String phone = scn.next();
			String strAge = scn.next();
			int age = Integer.parseInt(strAge);
			Member newMember = new Member(id, name, phone, age);
			
			members[i] = newMember;
		}
		//1.조회(이름) | 2.변경(아이디, 연락처) | 3. 조회 (나이 큰 회원만) | 4. 종료  
		while(true) {
			System.out.println("1.조회(이름) | 2.변경(아이디, 연락처) | 3. 조회 (나이 큰 회원만) | 4. 종료");
			System.out.println("선택> ");
			int menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				System.out.print("이름 입력 > ");
				String searchName = scn.next();
				for (Member member : members) {
					if(member.memName.equals(searchName)) {
						member.showInfo();
						
					}						
				}				
			} else if (menu == 2) {
				System.out.print("아이디 입력 > ");
				String searchId = scn.next();
				for (Member member : members) {
					if(member.getMemID().equals(searchId)) {
						System.out.println("변경할 전화번호 입력 > ");
						member.setMemPhone(scn.next());
						
					}
				}
			} else if (menu == 3) {
				System.out.print("나이 입력 > ");
				int searchAge = scn.nextInt();
				for (Member member : members) {
					if(member.getMemAge() > searchAge) {
						member.showInfo();
						
					}
				}				
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;				
			} else {			
				for(Member member : members) {
					member.showInfo();
				}					
			}
			System.out.println("프로그램 종료");
		}
	}
}
