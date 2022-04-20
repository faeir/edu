package co.edu.collection;

import java.util.ArrayList;

import co.edu.friend.Friend;
import co.edu.friend.Gender;

public interface FriendService {
	public int ADD = 1;
	public int MOD = 2;
	public int DEL = 3;
	public int SEARCH = 4;
	public int MENF = 5;
	public int WOMENF = 6;
	public int ALL_FIND = 7;
	
	//추가,수정,삭제,조회를 위한 메소드 생성
	public void addFriend(Friend friend);
	public void modFriend(Friend friend);
	//public void modFriends(String name, String phone);
	public void remFriend(String name);
	public Friend findFriend(String name);
	public ArrayList<Friend> findGender(Gender gender);
	public ArrayList<Friend> findAll (Friend friend);
}
