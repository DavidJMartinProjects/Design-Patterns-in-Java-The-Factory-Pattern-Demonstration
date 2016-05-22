
public class TestFactoryPattern {
	public static void main(String[] args) {	
		// create new Car Objects
		Car obj1 = CarFactory.buildCar(CarType.SMALL);
		Car obj2 = CarFactory.buildCar(CarType.SEDAN);
		Car obj3 = CarFactory.buildCar(CarType.LUXURY);
		
		//call drive methods
		obj1.drive();
		obj2.drive();
		obj3.drive();
		
		// check object types
		System.out.println(obj1 instanceof SmallCar);
		System.out.println(obj2 instanceof SedanCar);
		System.out.println(obj3 instanceof LuxuryCar);		
	}
}
