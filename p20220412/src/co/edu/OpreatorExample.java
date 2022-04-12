package co.edu;

public class OpreatorExample {

	public static void main(String[] args) {
		//증감연산자,
		int num1 = 10;
		int num2 = 20;
		num1 = num1 + 2; //num1의 값을 읽고 결과값을 대입.
		num1 = num1 + 2;
		System.out.println(num1);
		
		num1 += 1; // 우측값을 누적 연산
		num1++; // 1을 누적 연산.
		System.out.println(num1);
		System.out.println(num1++); // 출력처리 + 1.(선출력 후처리)
		System.out.println(num1);
		System.out.println(++num1); // +1 후 출력처리.
		
		int result = num1++ + ++num2; // 18 + 21
		System.out.println(result + ",num1: " + num1 + ", num2: "+ num2);
		
		byte num3 = 10; // byte + short < int < long
		//num3 = num3 + 1; // 정수연산 기본 int타입으로 처리 (1이 int타입이라 오류)
		num3 += 1;
		num3++;
		
		num3 = -125;
		num3--; //126
		num3--; //127
		num3--; //-128
		num3--; //-127
		num3--; //-126
		System.out.println(num3);
	}

}
