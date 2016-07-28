
public class SmallCar extends Car implements CarBehaviour {
	public SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	//override base class construct() method
	public void construct() {
		System.out.println("Building Small Car Class...");
	}
	//implement interface methods 
	public void drive() {
		System.out.println("Small Car is Driving..");
	}
}
