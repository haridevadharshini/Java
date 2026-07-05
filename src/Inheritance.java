class Fruit 
{
	String name;
	String taste;
	String size;
	Fruit(String name,String taste, String size){
	this.name = name;
	this.taste = taste;
	this.size = size;
	}
	void eat(){
		System.out.println(name + " tastes " + taste);
	}
}
class Apple extends Fruit
{
	Apple(String size){ super("Apple","sweet and crunchy",size); }
	void eat(){
		System.out.println("Apple tastes sweet and crunchy");
	}
}
class Orange extends Fruit
{
	Orange(String size){ super("Orange","tangy and juicy",size);}
	void eat(){
		System.out.println("Orange tastes tangy and juicy");
	}
}
public class Inheritance
{
	public static void main(String[] args) 
	{
		Fruit a = new Apple("Medium");
		Fruit o = new Orange("Small");
		a.eat();
		o.eat();
		
	}
}
