package co.edu;

public class OperatorExample2 {

	public static void main(String[] args) {
		// 십진수 10을 2진수로 표현하면 1010.
		int num10 = 10;
		System.out.println(~num10); // -11
		
		boolean isTure = false;
		isTure = !isTure;
		isTure = !isTure;
		isTure = !isTure;
		isTure = !isTure;		
		System.out.println(isTure);

		if(!(num10 > 5)) {
			System.out.println("참입니다");
		} else {
			System.out.println("거짓입니다");
		}
	}

}
