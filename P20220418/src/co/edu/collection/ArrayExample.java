package co.edu.collection;
// 배열 vs. 컬렉션

import java.util.ArrayList;

// 배열활용한 프로그램, 컬렉션을 활용한 프로그램
// 인터페이스 선언(공통규칙) => 구현하는 클래스.

import co.edu.friend.Friend;

public class ArrayExample {
	public static void main(String[] args) {
		ArrayList friendList = new ArrayList();
		friendList.add(new Friend("아무개", "010-1111")); // 추가
		friendList.add(new Friend("박무개", "010-1122"));
		friendList.add(new Friend("박개", "010-1122"));
		friendList.add(new Friend("박무", "010-1122"));
		friendList.add(new Friend("무개", "010-1122"));
		friendList.add(new Friend("박무개1", "010-1122"));
		
		friendList.remove(0); //삭제
		
		//for(int i = 0; i < friendList.size(); i++) {
			//System.out.println(friendList.get(i));
		System.out.println((Friend)friendList.get(3));
		
		}
		//friend f2 = (Friend)friendList.get(0); // get(인덱스) => Object타입 = 
		
	}


//String name = ((Friend) friendList.get(0)).getName() 

//Friend f2 = (Friend) friendList.get(0);
//f2.getName().equals("");