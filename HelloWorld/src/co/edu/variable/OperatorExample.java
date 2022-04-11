package co.edu.variable;

public class OperatorExample {

	public static void main(String[] args) {
	   int money = 75380;
	   int m1 =(int)(money/50000);
	   int m2 =(money%50000)/10000;
	   int m3 =(money%10000)/5000; 
	   int m4 =(money%5000)/1000;
	   int m5 =(money%1000)/500;
	   int m6 =(money%500)/100;
	   int m7 =(money%100)/50;
	   int m8 =(money%50)/10;
	   System.out.println("금액 : " +money);
	   System.out.println("오만원권: " + m1 +", 만원권 : " + m2 +
			   ", 오천원권 : " + m3 +", 천원권 : " + m4 +", 오백원 : " + m5 +
			   ", 백원 : " + m6 +", 오십원 : " + m7 +", 십원 : " + m8);
	}
}
