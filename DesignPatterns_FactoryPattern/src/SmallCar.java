
public class SmallCar extends Car {
	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	// implementation of abstract method in parent class
	public void construct() {
		System.out.println("Building Small Car...");
	}
}
