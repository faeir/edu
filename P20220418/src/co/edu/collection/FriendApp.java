package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

// 친구목록 저장하기 App.
// 추가, 수정, 삭제, 조회
// 1) 배열 2) 컬렉션 <= 인터페이스 구현
public class FriendApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		FriendService service = new FriendServiceArray();
//		FriendService service = new FriendServiceList();

		while (true) {
			System.out.println("1.추가 | 2.수정 | 3.삭제 | 4.조회 | 5.남자 | 6.여자 | 7.전체 목록 | etc.종료");
			System.out.println("메뉴를 선택 >");
			int num = scn.nextInt();
			scn.nextLine();

			if (num == FriendService.ADD) {
				System.out.println("이름을 입력해주세요");
				String fNm = scn.next();
				System.out.println("전화번호를 입력해주세요");
				String fPn = scn.next();
				System.out.println("성별(남자/여자)을 입력해주세요");
				String gender = scn.next();
				Gender gen = Gender.MEN;
				if (gender.startsWith("남")) {
					gen = Gender.MEN;
				} else if (gender.startsWith("여")) {
					gen = Gender.WOMEN;
				}
				Friend friend = new Friend(fNm, fPn, gen);
				service.addFriend(friend);

			} else if (num == FriendService.MOD) {
				System.out.print("정보를 수정 하는 친구의 이름 >");
				String cFn = scn.next();
				System.out.print("전화 번호 변경 >");
				String cFph = scn.next();
				Friend friend = new Friend(cFn, cFph);
				service.modFriend(friend);
			} else if (num == FriendService.DEL) {
				System.out.print("정보를 삭제 하는 친구의 이름 >");
				String rFn = scn.next();
				service.remFriend(rFn);
			} else if (num == FriendService.SEARCH) {
				System.out.print("정보를 검색 하는 친구의 이름 >");
				String sFn = scn.next();
				service.findFriend(sFn);
			} else if (num == FriendService.MENF) {
				System.out.println("남성 친구의 정보를 출력합니다 >");
				ArrayList<Friend> list = service.findGender(Gender.MEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else if (num == FriendService.WOMENF) {
				System.out.println("여성 친구의 정보를 출력합니다 >");
				ArrayList<Friend> list = service.findGender(Gender.WOMEN);
				for (Friend friend : list) {
					System.out.println(friend.toString());
				}
			} else if (num == FriendService.ALL_FIND) {
				System.out.println("전체 친구 목록을 출력합니다");
				ArrayList<Friend> allList = service.findAll(null);
				for (Friend friend : allList) {
					System.out.println(friend.toString());
				}
			}
			
			else {
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
