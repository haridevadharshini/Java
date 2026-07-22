// Remove or correct the package import if it conflicts with this file
// import OOPS.Animal;

class Animal {
	// Fixed: Added a method body for eat()
	void eat() {
		System.out.println("Animal is eating food");
	}

	// Fixed: Added the sleep() method so a.sleep() works in main
	void sleep() {
		System.out.println("Animal is sleeping");
	}
}

class Bird extends Animal {
	// Overrides the parent eat() method
	@Override
	void eat() {
		System.out.println("Bird is pecking food");
	}

	// Overrides the parent sleep() method
	@Override
	void sleep() {
		System.out.println("Bird is sleeping in a nest");
	}

	// Unique method only available to Bird
	void fly() {
		System.out.println("Birds fly in the sky");
	}
}

class InheriDisplay {
	public static void main(String[] args) {
		Animal a = new Animal();
		Bird b = new Bird();

		// Animal references calling Animal methods
		a.eat();    // Output: Animal is eating food
		a.sleep();  // Output: Animal is sleeping

		// Bird references calling overridden and unique methods
		b.eat();    // Output: Bird is pecking food
		b.sleep();  // Output: Bird is sleeping in a nest
		b.fly();    // Output: Birds fly in the sky
	}
}
