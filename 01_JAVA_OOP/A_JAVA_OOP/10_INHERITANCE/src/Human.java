
public class Human extends Mammal {
	public void goToWork(){
		System.out.println("I'm going to work, something only humans can do.");
	}
	public void startSleeping() {
		//override
		System.out.println("Toss and Turn");
		//gives the ParentClass
		super.startSleeping();
	}
}
