package co.edu.variable;

public class VarExample6 {

	public static void main(String[] args) {
		String myName = "홍길동"; // 참조 데이터 타입
				
		int age = 25; // 기본 데이터 타입,
		double height = 167.4;
		int mathScore, engScore;
		mathScore = 80;
		engScore= 90;
		
		System.out.println(myName + "의 나이는 " + age + "이고 신장은 " + height//
				+"이고" + " 엉어,수학점수의 합은" + (mathScore + engScore));
		
		//char firstChar = myName.charAt(0);
		//System.out.println((int)firstChar);
		
	}

}
