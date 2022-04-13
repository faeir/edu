package co.edu.array;

public class ForExample {

	public static void main(String[] args) {
		// 주사위 2개 던짐
		// 2개의 합이 6이 되는 경우.
				
		System.out.println("합이 6이 되는 조합은");
		for (int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j++)
				if (i + j ==6) {
					System.out.println("(" + i + "," + j + ")");
			}
		}		
	}
}