package org.cvtc.shapes;

/**
 * @author Heather
 *
 */

public class Sphere implements ShapeInterface {

	/**private float radius;

	/**
	 * 
	 * @return radius
	 */
	/**public float getRadius() {
		//make sure the radius is not negative
		if (radius < 0) {
			radius = 0.0f;
		}
		return radius;
	}
	/**
	 * 
	 * @param set the radius
	 */
	/**private void setRadius(float radius) {
		this.radius = radius;
	}
	@Override
	public float surfaceArea() {
		//calcuate the sphere's surface area
		return (float) (4 * Math.PI * (radius * radius));
	}
	@Override
	public float volume() {
		//calculate the volume of the sphere
		return (float) ((4.0f/3.0f) * Math.PI * (Math.pow(radius, 3)));
	}
	@Override
	public void render() {
		//Display a dialog box with sphere
		//JOptionPane.showMessageDialog(null, "Sphere \n Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Radius: " + getRadius());
		String message = "Sphere \n Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Radius: " + getRadius();
		this.dialog.Show(message, "Sphere");
	}
	
	public Sphere(float radius, Dialog dialog) {
		super(dialog);
		setRadius(radius);
	}*/
	
	@Override
	public void draw() {
		System.out.println("Inside Sphere::draw() method.");
	}
	
}
