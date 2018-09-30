package org.cvtc.shapes;

public class ShapeFactory {

	public ShapeInterface getshape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("SPHERE")) {
			return new Sphere();
		}
		else if(shapeType.equalsIgnoreCase("CUBOID")) {
			return new Cuboid();
		}
		else if(shapeType.equalsIgnoreCase("CYLINDER")) {
			return new Cylinder();
		}
		return null;
	}
}
