package co.edu.friend;
// 친구의 주소록 : 이름, 연락처
// 학교 친구 : 학교이름, 전공과목
// 회사 친구 : 회사이름, 부서.

public class Friend {
	private String name;
	private String phone;
	private Gender gender; // 남녀구분 enum에서 지정한 타입 MEN, WOMEN만 입력가능
	
	//생성자
	public Friend() {
		
	}
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}	
	
	public Friend(String name, String phone, Gender gender) {
		super();
		this.name = name;
		this.phone = phone;
		this.gender = gender;
	}
	//메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {//final 사용시 상속/재정의 불가능
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}		

	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Friend [name = " + name + ", phone = " + phone + ", Gender = " + gender + "]";
	}
	

	
}
