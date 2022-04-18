package co.edu.poly;

public class Tire {
	//필드
	public int maxRotation; // 최대 회전 내구도
	public int accumulateRotation; // 현재 사용 내구도
	public String location; // 자동차의 위치
	
	//생성자 
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		accumulateRotation++;
		if(accumulateRotation < maxRotation) {
			System.out.println(location + " Tire수명은 " + (maxRotation - accumulateRotation) + "회전 남았습니다");
			return true;			
		} else {
			System.out.println("***" + location + " Tire 펑크 *** ");
			return false;
		}
	}
}
