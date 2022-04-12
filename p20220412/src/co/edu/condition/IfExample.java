package co.edu.condition;

public class IfExample {

	public static void main(String[] args) {
		int score = 75;
		
		// 90점보다 크면 A, 80 = B, 70 = C 나머지 = F
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70 ) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
			
	}

}
