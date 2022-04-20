package co.edu.collection;

import java.util.ArrayList;
import java.util.Scanner;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//컬렉션 기능 활용.

public class FriendServiceArray implements FriendService {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	@Override
	public void addFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				System.out.println("친구 추가 완료");
				break;
			}
		}
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(friend.getName())) {
				friends[i].setPhone(friend.getPhone());
				System.out.println("정보가 변경 되었습니다.");
				break;
			}
		}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getName().equals(name)) {
				friends[i] = null;
				System.out.println("친구 정보 삭제");
				break;
			}
		}
	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				System.out.println(friends[i].toString());
				break;
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		Friend[] findGender = new Friend[10];
		for (int i = 0; i < friends.length; i++) {
			if (friends[i].getGender() == gender) {
				 
			}
		}
		return null;
	}

	@Override
	public ArrayList<Friend> findAll(Friend friend) {
	
			return null;
		}
	}
