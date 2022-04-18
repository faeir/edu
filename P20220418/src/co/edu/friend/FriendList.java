package co.edu.friend;

import java.util.Scanner;

public class FriendList {

	public static void main(String[] args) {
		
		final String val = "Hong";
//		val = "Hong2";

		Friend[] friends = new Friend[10];
//		friends[0] = new UnivFriend("홍길동","010-1111-2222","대구대학교","컴정");
//		friends[1] = new ComFriend("김길동","010-1111-3333","네이버","개발");
//		friends[2] = new Friend("박길동","010-2222-3333");

		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("1.친구등록 | 2.리스트 | 3.조회 | 4.종료");

			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.print("등록할 친구 항목 (1)일반 / (2)대학 / (3)회사 >");
				int fSel = scn.nextInt();
				
				if (fSel == 1) {
					System.out.println("일반 친구 항목을 선택하셨습니다");
					System.out.print("친구 이름 >");
					String fNm = scn.next();
					System.out.print("전화 번호 >");
					String fPn = scn.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new Friend(fNm, fPn);
							System.out.println("일반 친구 등록");
							break;
						}
					}
				} else if (fSel == 2) {
					System.out.println("대학 친구 항목을 선택하셨습니다 >");
					System.out.print("친구 이름 >");
					String ufNm = scn.next();
					System.out.print("전화 번호 >");
					String ufPn = scn.next();
					System.out.print("학교 이름 >");
					String ufUn = scn.next();
					System.out.println("전공 >");
					String ufDn = scn.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new UnivFriend(ufNm, ufPn, ufUn, ufDn);
							System.out.println("대학 친구 등록");
							break;
						}
					}
				} else if (fSel == 3) {
					System.out.println("회사 친구 항목을 선택하셨습니다 >");
					System.out.print("친구 이름 >");
					String cfNm = scn.next();
					System.out.print("전화 번호 >");
					String cfPn = scn.next();
					System.out.print("회사 이름 >");
					String cfUn = scn.next();
					System.out.println("직책 >");
					String cfDn = scn.next();
					for (int i = 0; i < friends.length; i++) {
						if (friends[i] == null) {
							friends[i] = new ComFriend(cfNm, cfPn, cfUn, cfDn);
							System.out.println("회사 친구 등록");
							break;
						}
					}
				}

			} else if (menu == 2) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println("친구 정보 : " + friend.toString());
					}
				}
			} else if (menu == 3) {
				System.out.print("검색할 친구 이름 >");
				String sFrn = scn.next();
				for (int i = 0; i < friends.length; i++) {
					if (friends[i].getName().equals(sFrn)) {
						System.out.println(friends[i].toString());
						break;
					}
				}
			} else if (menu == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}