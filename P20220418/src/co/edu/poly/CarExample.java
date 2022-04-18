package co.edu.poly;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		for (int i = 0; i < 6; i++) {
			int problemLocation = car.run();

			switch (problemLocation) {
			case 1:
				System.out.println("좌앞 재생타이어로 교체합니다.");
				car.frontLeft = new Tire("좌앞", 3);
				break;
			case 2:
				System.out.println("우앞 중고타이어로 교체합니다.");
				car.frontRight = new Tire("우앞", 2);
				break;
			case 3:
				System.out.println("좌뒤 한국타이어로 교체합니다.");
				car.backLeft = new HankookTire("좌뒤", 12);
				break;
			case 4:
				System.out.println("우뒤 금호타이어로 교체합니다.");
				car.backRight = new KumhoTire("우뒤", 15);
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("---------------------------------");
		}

	}

}
