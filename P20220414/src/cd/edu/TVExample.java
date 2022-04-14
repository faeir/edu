package cd.edu;

public class TVExample {

	public static void main(String[] args) {
		int num = 10;
		String str = "hello";
				
		Television tv = new Television(); //
		tv.company = "삼성";
		tv.color = "검정";
		tv.price = 300000;
		tv.model = "30인치";
		tv.turnON();
		tv.changeChanel(10);
		tv.turnOff();
		
		Television tv1 = new Television(); //
		tv1.company = "삼성";
		tv1.color = "검정";
		tv1.price = 300000;
		tv1.model = "30인치";
		tv1.turnON();
		tv1.changeChanel(10);
		tv1.turnOff();
		
		System.out.println(tv == tv1);
		System.out.println(tv);
		System.out.println(tv1);
		
		Student stud1 = new Student();
		stud1.name = "홍길동";
		stud1.studNo = "22-1234567";
		stud1.age = 20;
		stud1.height = 174.5;
		
		Student stud2 = new Student();
		stud2.name = "우영원";
		stud2.studNo = "22-323456";
		stud2.age = 24;
		stud2.height = 174.5;
		
		Student stud3 = new Student("황화경", "22-876456");
		stud3.age = 25;
		stud3.height = 163.5;
		
		Student stud4 = new Student("아무개", "10-1101101", 20);
		stud4.height = 178.6;		
		
		stud1.study();
		stud2.study();
		
		stud3.showInfo();
		stud4.showInfo();
		
		
	}

}
