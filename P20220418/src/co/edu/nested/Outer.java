package co.edu.nested;

public class Outer {
	// 필드
	private String f1;

	// 멤버 클래스(클래스 안의 클래스가 존재)
	
	class Inner1 {// 인스턴스 맴버 클래스
		String f2;

		void method2() {
			System.out.println("method2() call");
		}

	}

	static class Inner2 {// 정적 멤버 클래스
		String f4;
		static String f5;
		
		void method4() {
			System.out.println("method4() call");
		}
		static void method5() {
			System.out.println("method5() call");
		}
	}

	// 메소드
	public void method1() {
		System.out.println("method1() call");

		// 로컬 클래스 (메소드 안의 클래스)
		class Local {
			String f3;

			void method3() {
				System.out.println("method3() call");

			}
		}

		Local local = new Local();
		local.method3();
	}

}