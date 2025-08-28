package placementteam.test;
abstract class Shape{
	abstract double calculateArea();
	void display() {
		System.out.println("Calculating area...");
	}
}
class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double calculateArea(){
		return Math.PI * radius * radius;
	}
}
class Rectangle extends Shape{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double calculateArea(){ 
		return length*breadth;
	}
}
class Triangle extends Shape {
	int base;
	int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	double calculateArea(){
		return 0.5*base*height;
	}
}

public class AreaOfShape{
	public static void main(String args[]){
		Shape shapes[]={new Circle(10),new Rectangle(10,20),new Triangle(10,25)};
		for(Shape s:shapes){
			s.display();
			System.out.println(s.calculateArea());
		}
	}
}		

