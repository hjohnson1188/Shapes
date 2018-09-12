package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Heather
 *
 */

public class Cylinder extends Shape {

	private float radius = 0.0f;
	private float height = 0.0f;
	
	/**
	 * 
	 * @return the radius
	 */
	public float getRadius() {
		//Make sure radius is not negative
		if (radius < 0) {
			radius = 0.0f;
		}
		return radius;
	}
	/**
	 * 
	 * @param set the radius
	 */
	private void setRadius(float radius) {
		this.radius = radius;
		
	}
	/**
	 * 
	 * @return the height
	 */
	public float getHeight() {
		//make sure height is not negative
		if (height < 0) {
			height = 0.0f;
		}
		return height;
	}
	/**
	 * 
	 * @param set the height
	 */
	private void setHeight(float height) {
		this.height = height;
	}
	
	@Override
	public float surfaceArea() {
		//calcuate the cylinder's surface area
		return (float) (2 * Math.PI * radius * (radius + height));
	}
	@Override
	public float volume() {
		//calculate the volume of the cylinder
		return (float) (Math.PI * radius * radius * height);
	}
	@Override
	public void render() {
		//Display a dialog box with cylinder
		JOptionPane.showMessageDialog(null, "Cylinder \n Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Radius: " + getRadius() + "\n Height: " + getHeight());
	}
	
	public Cylinder(float radius, float height) {
		setRadius(radius);
		setHeight(height);
	}
}
