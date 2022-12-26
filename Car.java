package week1.day1;

public class Car {

	public void driveCar() {
		System.out.println("Drive car carefully");
	}

	public void applyBrake() {
		System.out.println("Stop the car");

	}
	
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBrake();
		obj.driveCar();
	}
}
