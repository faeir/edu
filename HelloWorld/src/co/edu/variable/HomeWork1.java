package co.edu.variable;

public class HomeWork1 {

	public static void main(String[] args) {
		int orange, m1, m2, m3;
		orange = 127;		
		m1 = orange / 10;
		m2 = (orange%10)/5;
		m3 = m2 + 1;
		
		System.out.println("10개씩 담을 수 있는 상자 수 : " + m1);
		if (m2 > 0) {
			System.out.println("5개씩 담을 수 있는 상자 수 : " + m3);
		}else {
			System.out.println("5개씩 담을 수 있는 상자 수 : " + m2);
		}

	}

}
