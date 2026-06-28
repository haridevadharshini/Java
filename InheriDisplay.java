class Animal 
{
	void eat(){
	System.out.println("It is eating");
		}
	void sleep(){
		System.out.println("It is sleeping");
		}
}
class Bird extends Animal
{
	 void eat() {
        System.out.println("Bird is pecking food");
    }
    void sleep() {
        System.out.println("Bird is sleeping in a nest");
    }
	void fly(){
		System.out.println("Birds fly in the sky");
	}
}
class InheriDisplay
{
	public static void main(String[] args) 
	{
		Animal a = new Animal();
		Bird b = new Bird();
		a.eat();
		a.sleep();
		b.eat();
		b.sleep();
		b.fly();

	}
}
