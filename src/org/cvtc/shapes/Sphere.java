package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Heather
 *
 */

public class Sphere extends Shape {

	private float radius;

	/**
	 * 
	 * @return radius
	 */
	public float getRadius() {
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
	public void setRadius(float radius) {
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
		JOptionPane.showMessageDialog(null, "Sphere \n Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Radius: " + getRadius());
	}
	
	public Sphere(float radius) {
		setRadius(radius);
	}
	
}
