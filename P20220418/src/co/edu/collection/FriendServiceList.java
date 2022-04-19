package co.edu.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.friend.Friend;

//배열 기능 활용.

public class FriendServiceList implements FriendService {
	Scanner scn = new Scanner(System.in);

	ArrayList friends = new ArrayList();

	@Override
	public void addFriend(Friend friend) {
		System.out.println("이름을 입력해주세요");
		String fNm = scn.next();
		System.out.println("전화번호를 입력해주세요");
		String fPn = scn.next();
		friends.add(new Friend(fNm, fPn));
		}	

	@Override
	public void modFriend(Friend friend) {
		System.out.print("정보를 수정 하는 친구의 이름 >");
		String cFn = scn.next();
		System.out.print("변경할 전화 번호 >");
		String cFp = scn.next();
		for (int i = 0; i < friends.size(); i++)
			if (((Friend) friends.get(i)).getName().equals(cFn)) {
				((Friend) friends.get(i)).setPhone(cFp);				
			}
		}	

	@Override
	public void remFriend(String name) {
		System.out.print("정보를 삭제 하는 친구의 이름 >");
		String rFn = scn.next();;
		for (int i = 0; i < friends.size(); i++)
			if (((Friend) friends.get(i)).getName().equals(rFn)) {
				friends.remove(i);
			}
	}

	@Override
	public Friend findFriend(String name) {
		System.out.print("정보를 삭제 하는 친구의 이름 >");
		String rFn = scn.next();;
		for (int i = 0; i < friends.size(); i++)
			if (((Friend) friends.get(i)).getName().equals(rFn)) {
				System.out.println(friends.get(i));
				break;
			}
		return null;
		}		
		
	}

