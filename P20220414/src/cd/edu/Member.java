package cd.edu;

public class Member {
	// 필드 => 회원 정보(ID, 이름, 연락처, 회원 포인트)
	private String memId;
	String memName;
	private String memPhone;
	private int memAge; // -14
	
	
	
	// 생성자
	
	public Member(String memId, String memName, String memPhone, int memAge) {
		super();
		this.memId = memId;
		this.memName = memName;
		this.memPhone = memPhone;
		this.memAge = memAge;
	}
	
	// 메소드
	
	void setMemID(String Id) {
		memId = Id;
	}
	
	String getMemID() {
		return memId;
	}
	
	void setMemAge(int age) {
		if (age < 0) {
			memAge = 10;
		} else {
			memAge = age;
		}
	}
	
	int getMemAge() {
		return memAge;
	}
		
	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public String getMemPhone() {
		return memPhone;
	}

	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}

	void showInfo() {
		System.out.printf("회원이름 : %4s \n 연락처 : %13s\n 나이 : %2d\n", memName, memPhone, memAge);
	}
}
