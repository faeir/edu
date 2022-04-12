package co.edu.loop;

public class NestedExample {

	public static void main(String[] args) {
		
	for (int j = 1; j < 6; j++) { //줄단위 계산식
		for (int i = 5; i > 0; i--) { //줄 자체의 계산식
			if (j < i) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}	
	}
}