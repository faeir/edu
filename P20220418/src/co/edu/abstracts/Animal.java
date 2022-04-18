package co.edu.abstracts;

public abstract class Animal {
	// Animal() 생성자로 인스턴스 생성 불가.
	
	public Animal( ) {
		
	}
	
	public abstract void eat(); //강제로 eat() 구현
	public abstract void run();
	
	public void sleep() {
		System.out.println("잠을 잡니다");
	}
}