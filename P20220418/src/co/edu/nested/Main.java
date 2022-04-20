package co.edu.nested;


public class Main {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		outer.method1();
		
		
		//instance 맴버클래스.
		Outer.Inner1 inner = outer.new Inner1();
		inner.method2();
	
		
		// static 맴버클래스
		Outer.Inner2.method5();
		
		Outer.Inner2 inner2 = new Outer.Inner2();
		inner2.method4(); //인스턴스 메소드.
		inner2.method5(); //정적 메소드.
	}

}
