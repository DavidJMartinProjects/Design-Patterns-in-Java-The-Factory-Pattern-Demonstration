
public class SedanCar extends Car {
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	// implementation of abstract method in parent class
	public void construct() {
		System.out.println("Building Sedan Car...");
	}
}
