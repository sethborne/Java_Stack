
public class Mammal {
	private boolean	sleeping = false;
	public void regulateTemperature() {
		System.out.println("My Temperature is Just Right Now.");
	}
	public void startSleeping(){
		sleeping = true;
		System.out.println("ZzZz");
	}
	public boolean isSleeping(){
		return sleeping;
	}
	public void breath() {
		System.out.println("Loudly");
	}
}
