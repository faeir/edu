package co.edu.Interface;

// 인터페이스를 구현하는 클래스통하여 구현이 된다
public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV 킴");
	}

	@Override
	public void turnOff() {
		System.out.println("TV 끔");
	}

	@Override
	public void volumeUp() {
		System.out.println("TV 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV 볼륨 다운");
	}

	@Override
	public void adjustScreen() {
		//RemoteControl.super.adjustScreen();
		System.out.println("TV 화면 조정");
	}

}
