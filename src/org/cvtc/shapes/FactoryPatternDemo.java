package org.cvtc.shapes;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		//Get sphere object
		ShapeInterface shape1 = shapeFactory.getshape("SPHERE");
		
		//call the draw method of sphere
		shape1.draw();
		
		//get cuboid shape object
		ShapeInterface shape2 = shapeFactory.getshape("CUBOID");
		
		//call the draw method of cuboid
		shape2.draw();
		
		//get cylinder shape object
		ShapeInterface shape3 = shapeFactory.getshape("CYLINDER");
		
		//call the draw method of cylinder
		shape3.draw();
	}

}
