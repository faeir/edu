package co.edu;

public class ReferenceExample {

	public static void main(String[] args) {
		// 기본타입.
		int num1 = 100;
		int num2 = 100;
		
		if (num1 == num2) {
			System.out.println("동일");
		} else {
			System.out.println("다름");
		}
		
		//참조타입. // 클래스는 new를 붙혀서 생성
		String str1 = new String("홍길동"); // 인스턴스. 
		String str2 = new String("홍길동"); // 인스턴스.
		str1 = null;
		str1 = "고길동";
		
		// {참조변수 == 주소값으로 비교하기 
		if(str1.equals(str2)){	// 값을 비교하려면 [equals] 메소드 비교
			System.out.println("동일");
		} else {
			System.out.println("다름");
		}		
		
	}

}
