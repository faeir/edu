package co.edu.variable;

public class VarExample2 {
	public static void main(String[] args) {
		int ko = 80;
		int eng = 70;
		int math = 63;
		double avg = (ko + eng + math) / 3.0;
		
		ko = 85;
		eng = 75;
		math = 60;
		avg = (ko + eng + math) / 3.0;
		
		System.out.println(ko + "점, " + eng +"점, " + math + "점의 평균은 " + avg + "점 입니다");
		
	}

}
