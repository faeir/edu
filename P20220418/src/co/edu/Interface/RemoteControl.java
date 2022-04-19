package co.edu.Interface;

public interface RemoteControl {

	public int MAX_VOLUME = 10; // static final이 붙어있음

	public void turnOn(); // 추상메소드.
	public void turnOff(); //
	public void volumeUp();
	public void volumeDown();
	public default void adjustScreen() {
		System.out.println("화면 조정");		
	}
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다");
	}
}
