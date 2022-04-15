package co.edu.statics;
//co.edu.statics.Person => 풀네임
public class Person {
	
	final String nation = "Korea";
	final String ssn;
	static final double PI = 3.14; //(상수) 클래스 소속, 값 변경불가, 상수 필드는 대문자로만으로 작성한다 
	
	String name;
	
	public Person (String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
