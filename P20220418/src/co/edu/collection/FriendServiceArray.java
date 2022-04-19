package co.edu.collection;

import java.util.Scanner;

import co.edu.friend.Friend;

//컬렉션 기능 활용.

public class FriendServiceArray implements FriendService {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		System.out.println("이름을 입력해주세요");
		String fNm = scn.next();
		System.out.println("전화번호를 입력해주세요");
		String fPn = scn.next();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = new Friend();
				System.out.println("친구 추가 완료");
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		System.out.print("정보를 수정 하는 친구의 이름 >");
		String cFn = scn.next();
		System.out.print("전화 번호 변경 >");
		String cFph = scn.next();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(cFn)) {
				friends[i].setPhone(cFph);
				System.out.println("정보가 변경 되었습니다.");
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		System.out.print("삭제할 친구 이름 >");
		String dFr = scn.next();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(dFr)) {
				friends[i] = null;
				System.out.println("친구 정보 삭제");
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		System.out.print("검색할 친구 이름 >");
		String sFr = scn.next();
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(sFr)) {
				System.out.println(friends[i].toString());
				break;
			}
		}
		return null;
	}
}