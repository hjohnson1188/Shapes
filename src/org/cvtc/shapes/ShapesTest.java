package org.cvtc.shapes;

public class ShapesTest {

	public static void main(String[] args) {
		Sphere sphere = new Sphere(5);
		Cuboid cuboid = new Cuboid(4, 5, 3);
		Cylinder cylinder = new Cylinder(6, 7);
		
		cuboid.render();
		sphere.render();
		cylinder.render();

	}

}
