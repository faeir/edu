package co.edu.loop;

public class HomeWokr1 {

	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6) + 1;
				
		
		switch(dice) {
		case 1:
			System.out.println("주사위의 값이 1입니다");
			break;
		case 2:
			System.out.println("주사위의 값이 2입니다");
			break;
		case 3:
			System.out.println("주사위의 값이 3입니다");
			break;
		case 4:
			System.out.println("주사위의 값이 4입니다");
			break;
		case 5:
			System.out.println("주사위의 값이 5입니다");
			break;
		case 6:
			System.out.println("주사위의 값이 6입니다");
			break;
		}
		
	}

}
