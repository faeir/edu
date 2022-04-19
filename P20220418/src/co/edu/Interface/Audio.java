package co.edu.Interface;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("오디오 킴");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오 끔");
	}

	@Override
	public void volumeUp() {
		System.out.println("오디오 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("오디오 볼륨 다운");

	}
	

}
