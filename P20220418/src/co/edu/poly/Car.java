package co.edu.poly;

public class Car {	
	Tire frontLeft = new Tire("좌앞", 6);
	Tire frontRight = new Tire("우앞", 2);
	Tire backLeft = new Tire("좌뒤", 3);
	Tire backRight = new Tire("우뒤", 4);
	
	public int run() {
		System.out.println("자동자가 달립니다.");
		if(frontLeft.roll() == false) {
			stop();
			return 1;
		}
		if(frontRight.roll() == false) {
			stop();
			return 2;
		}
		if(backLeft.roll() == false) {
			stop();
			return 3;
		}
		if(backRight.roll() == false) {
			stop();
			return 4;
		} 
		return 0;
		
	}
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}
}
