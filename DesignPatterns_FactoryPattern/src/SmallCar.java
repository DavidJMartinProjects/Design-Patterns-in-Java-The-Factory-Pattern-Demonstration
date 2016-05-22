
public class SmallCar extends Car {
	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	public void construct() {
		System.out.println("Building Small Car...");
	}
}
