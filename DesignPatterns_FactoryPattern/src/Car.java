// Car.java is the parent class of all car instances 

public class Car {	
	private CarType model = null;
	
	public Car(CarType model) {
		this.model = model;
	}	
	
	public void construct () {
		System.out.println("Building Standard Car Base Class...");
	};
	//implement interface methods 
	public void drive() {
		System.out.println("Standard Car is Driving..");
	};
	
	// getters and setters
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
}
