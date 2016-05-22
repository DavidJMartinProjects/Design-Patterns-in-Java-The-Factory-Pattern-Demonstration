
public class SedanCar extends Car {
	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	public void construct() {
		System.out.println("Building Sedan Car...");
	}
}
