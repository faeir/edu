package co.edu.Interface;

//구현 클래스
interface Runnable {
	public void run();
}

class RunClass implements Runnable {
	@Override
	public void run() {
		System.out.println("움직입니다.");
	}
}

public class RunnableExample {
	public static void main(String[] args) {
		Runnable runnable = new RunClass();
		runnable.run();

		runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("멍멍이가 움직입니다");
			} // 익명 구현 객체.
		};
		runnable.run();

		// 익명 구현 객체. 담다표현식.  
		runnable = () -> System.out.println("야옹이가 움직입니다");
		
		runnable.run();
	}
}
