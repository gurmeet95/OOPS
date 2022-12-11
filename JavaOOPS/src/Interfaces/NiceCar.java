package Interfaces;

public class NiceCar {
	private Enginee eng;
	private Media music =new CDPlayer();
	public NiceCar() {
		eng=new PowerEnginee();
		
	}
	public NiceCar(Enginee eng) {
		this.eng=eng;
		
	}
	public void start() {
		eng.start();
		
	}
	public void stop() {
		eng.stop();
		
	}
	public void startMusic() {
		music.start();
	}
	public void stopMusic() {
		music.stop();
	}
	public void upgradeEnginee() {
		this.eng=new ElectricEnginee();
	}

}
