package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

// 친구목록 저장하기 App.
// 추가, 수정, 삭제, 조회
// 1) 배열 2) 컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
//		FriendService service = new FriendServiceArray();
		FriendService service = new FriendServiceList();
		
		while (true) {
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.조회 | etc.종료");
			System.out.println("메뉴를 선택 >");
			int num = scn.nextInt();
			scn.nextLine();			
			
			if (num == 1) {				
				service.addFriend(null);
			} else if (num == 2) {
				service.modFriend(null);
			} else if (num == 3) {
				service.remFriend(null);
			} else if (num == 4) {
				service.findFriend(null);
			} else {
				break;
			}
			System.out.println("프로그램을 종료합니다");
		}
		
//		FriendService service = new FriendServiceList();
		// 추가, 수정, 삭제, 조회 => 사용자가 앱 제어
		
		service.addFriend(null);
		service.modFriend(null);
		
	}

}
