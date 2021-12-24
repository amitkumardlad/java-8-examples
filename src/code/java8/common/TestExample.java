package code.java8.common;

interface Vehicle {
	// all are the abstract methods.
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);
}

class Bicycle implements Vehicle {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int newGear) {

		gear = newGear;
	}

	// to increase speed
	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {

		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}
}

class Bike implements Vehicle {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int newGear) {

		gear = newGear;
	}

	// to increase speed
	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {

		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}

}

class TestExample{

	public static void main(String[] args) {

		// creating an inatance of Bicycle
		// doing some operations
		Vehicle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);

		System.out.println("Bicycle present state :");
		((Bicycle) bicycle).printStates();

		// creating instance of the bike.
		Vehicle bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);

		System.out.println("Bike present state :");
		((Bike) bike).printStates();
	}
}
