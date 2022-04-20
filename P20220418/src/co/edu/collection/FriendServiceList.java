package co.edu.collection;

import java.util.ArrayList;
import java.util.List;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

//배열 기능 활용.

public class FriendServiceList implements FriendService {

	ArrayList<Friend> friends = new ArrayList<Friend>();

	@Override
	public void addFriend(Friend friend) {
		friends.add(friend);
	}

	@Override
	public void modFriend(Friend friend) {
		for (int i = 0; i < friends.size(); i++)
			if (friends.get(i).getName().equals(friend.getName())) {
				friends.get(i).setPhone(friend.getPhone());
			}
	}

	@Override
	public void remFriend(String name) {
		for (int i = 0; i < friends.size(); i++)
			if (friends.get(i).getName().equals(name)) {
				friends.remove(i);
			}
	}

	@Override
	public Friend findFriend(String name) {
		for (int i = 0; i < friends.size(); i++)
			if (friends.get(i).getName().equals(name)) {
				System.out.println(friends.get(i));
				break;
			}
		return null;
	}

	@Override
	public ArrayList<Friend> findGender(Gender gender) {
		ArrayList<Friend> list = new ArrayList<Friend>();
		for (int i = 0; i < friends.size(); i++) {
			if (friends.get(i).getGender() == gender) {
				// 열거형타입 클래스타입 같은 참조타입. 
				// 기본타입의 경우는 == 비교 연산자.
				// 열거형 == 비교 연산자로 비교.
				list.add(friends.get(i));
			}
		}
		return list;
	}

	@Override
	public ArrayList<Friend> findAll(Friend friend) {
		ArrayList<Friend> allList = new ArrayList<Friend>();
		for (int i = 0; i <friends.size(); i++) {
			allList.add(friends.get(i));
		}	
		return allList;
	}

}
