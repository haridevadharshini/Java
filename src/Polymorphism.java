class Shape
{
	void draw(){
		System.out.println("Drawing Shape");
	}
	void erase(){
		System.out.println("Erasing shape");
}
}
class Circle extends Shape
{
	void draw(){
	System.out.println("Drawing Circle");}
	void erase(){
		System.out.println("Erasing Circle");
	}
}
class Square extends Shape
{
	void draw(){
	System.out.println("Drawing Square");}
	void erase(){
		System.out.println("Erasing Square");
	}
}
class Triangle extends Shape
{
	void draw(){
	System.out.println("Drawing Triangle");}
	void erase(){
		System.out.println("Erasing Triangle");
	}
}
class Polymorphism
{
	public static void main(String[] args) 
	{
		Shape c = new Circle();
		Shape s = new Square();
		Shape t = new Triangle();
		c.draw();
		c.erase();
		s.draw();
		s.erase();
		t.draw();
		t.erase();
	}
}
