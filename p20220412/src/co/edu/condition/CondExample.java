package co.edu.condition;

public class CondExample {

	public static void main(String[] args) {
		// math random
		// 51 ~ 100 까지 임의 값.
		int randomVal = (int)(Math.random() * 50) + 51;
		
		randomVal /= 10;
		
		//100 ~ 90 A / 80 B / 70 C / 60 D / F 
		switch(randomVal) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;	
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
			break;
		}
		
	}

}
