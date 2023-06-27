package Phase1_assessment2;

	//Example of a class representing a Shape
	class Shape {
	//Encapsulated fields
	private String color;

	//Constructor
	public Shape(String color) {
	this.color = color;
	}

	//Encapsulation: Getter and Setter for color
	public String getColor() {
	return color;
	}

	public void setColor(String color) {
	this.color = color;
	}

	//Abstraction: Method to calculate area (to be implemented by subclasses)
	public double calculateArea() {
	return 0.0;
	}

	//Polymorphism: Method to display shape information
	public void displayInfo() {
	System.out.println("Shape - Color: " + color);
	}
	}

	//Example of a subclass inheriting from the Shape class
	class Circle extends Shape {
	private double radius;

	public Circle(String color, double radius) {
	super(color);
	this.radius = radius;
	}

	//Inheritance and Polymorphism: Override calculateArea() and displayInfo() methods
	@Override
	public double calculateArea() {
	return Math.PI * radius * radius;
	}

	@Override
	public void displayInfo() {
	System.out.println("Circle - Color: " + getColor() + "\nRadius: " + radius + ", Area: " + calculateArea());
	}
	}

public class PP8_Pillars {

		public static void main(String[] args) {
			 // Create objects of Shape and Circle classes
			 Shape shape = new Shape("Pink");
			 Circle circle = new Circle("Yellow", 8.0);

			 // Accessing class members through objects
			 shape.setColor("Green");
			 System.out.println("Shape color: " + shape.getColor());
			 shape.displayInfo();

			 circle.setColor("BLUE");
			 System.out.println("Circle color: " + circle.getColor());
			 circle.displayInfo();

		}

	}

