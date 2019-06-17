import java.awt.DisplayMode;
import java.util.Scanner;

import factory.Shape;
import factory.ShapeFactory;

public class Main {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int in = -1;
		displayMenu();
		while (true) {
			in = input.nextInt();
			switch (in) {
			case 1:
				factory();
				break;

			default:
				break;
			}
		}
	}
	private static void displayMenu() {
		System.out.println("Welcome to Desin Patterns: ");
		System.out.println("1- Factory");
	}
	private static void factory() {
		ShapeFactory shapeFactory =  new ShapeFactory();
		Shape rect = shapeFactory.getShape("rectangle");
		Shape circle = shapeFactory.getShape("circle");
		rect.draw();
		circle.draw();
		
	}

}
