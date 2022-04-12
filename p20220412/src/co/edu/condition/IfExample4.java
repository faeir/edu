package co.edu.condition;

public class IfExample4 {

	public static void main(String[] args) {
		// 임의의 값을 생성해주는 Math.random().
		int randomVal = (int) (Math.random() * 100) + 1; // 반환값이 double 0 <= 값 < 1
		System.out.println(randomVal);
		
		//생성된 값이 0 ~ 50까지 
		//생성된 값이 51 ~ 60까지
		//생성된 값이 61 ~ 70까지
		//생성된 값이 71 ~ 80까지
		//생성된 값이 81 ~ 90까지
		//생성된 값이 91 ~ 100까지
		if ((randomVal > 60) && (randomVal <= 70)) { 
		System.out.println("생성 된 값은 61~70까지의 범위 값.");
		} 
	}
}
