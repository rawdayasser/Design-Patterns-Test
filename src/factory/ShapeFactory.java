package factory;

public class ShapeFactory {
	public Shape getShape(String type) {
		if (type.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}else if (type.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		return null;
	}
}
