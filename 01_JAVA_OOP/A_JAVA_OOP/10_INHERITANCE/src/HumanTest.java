
public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human humanAdam = new Human();
		humanAdam.regulateTemperature();
		humanAdam.startSleeping();
		humanAdam.goToWork();
		boolean sleeping = humanAdam.isSleeping();
		if (sleeping) {
			System.out.println("The Human is Sleeping!");
		}
		humanAdam.breath();
		
	}

}
