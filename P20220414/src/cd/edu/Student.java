package cd.edu;

public class Student {
	
	//필드
	String name;
	String studNo;
	int age; 
	double height;
	
	//생성자 => 인스턴스를 생성시 처리할 기능 정의
	//매개값이 존재하지 않는 생성자 = 기본생성자
	//생성자는 필요 많큼 생성 가능
	
	//생성자는 필드의 값을 지정할 때. 
	
	public Student() {
		
	}
	
	public Student(String nm, String sn) {
		name = nm;
		studNo = sn;
	}
	//이름 학번 나이  
	public Student(String nm, String sn, int ag) {
		name = nm;
		studNo = sn;
		age = ag;
	}
	
	
	//메소드
	void study() {
		System.out.println(name + "이(가) 공부를 합니다");
	}
	
	public Student(String name, String studNo, int age, double height) {
		super();
		this.name = name;
		this.studNo = studNo;
		this.age = age;
		this.height = height;
	}

	void eat() {
		System.out.println(name + "이(가) 식사를 합니다");
	}
	 
	void showInfo() {
		System.out.println("이름은 " + name + " 학번은 " +//
							studNo + " 나이는 " + age +" 이며"//
							+ " 키는 " + height + "cm 입니다");
	}


}
