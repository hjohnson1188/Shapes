package org.cvtc.shapes;

import javax.swing.JOptionPane;

/**
 * @author Heather
 *
 */

public class Cuboid extends Shape {

	private float width = 0.0f;
	private float height = 0.0f;
	private float depth = 0.0f;

	/**
	 * 
	 * @return the width
	 */
	public float getWidth() {
		//Make sure the entered width is not a negative. If negative, set back to 0.
		if (width < 0) {
			width = 0.0f;
		}
		return width;
	}
	/**
	 * 
	 * @param set the width
	 */
	private void setWidth(float width) {
		this.width = width;
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
	/**
	 * 
	 * @return the depth
	 */
	public float getDepth() {
		//Make sure depth is not negative.
		if (depth < 0) {
			depth = 0.0f;
		}
		return depth;
	}
	/**
	 * 
	 * @param  set the depth
	 */
	private void setDepth(float depth) {
		this.depth = depth;
	}
	@Override
	public float surfaceArea() {
		//calcuate the cuboids surface area
		return (2 * getDepth() * getWidth() )+ (2 * getDepth() * getHeight() )+ (2 * getHeight() * getWidth() );
	}
	@Override
	public float volume() {
		//calculate the volume of the cuboid
		return getDepth() * getWidth() * getHeight();
	}
	@Override
	public void render() {
		//Display a dialog box with Cuboid
		JOptionPane.showMessageDialog(null, "Cuboid \n Volume = " + volume() + "\n" + "Surface Area = " + surfaceArea() + "\n" + "Dimensions: \n Depth: " + getDepth() + "\n Height: " + getHeight() + "\n Width: "+ getWidth());
	}
	
	
	public Cuboid(Dialog MessageBox, float width, float height, float depth) {
		setWidth(width);
		setHeight(height);
		setDepth(depth);
	}
}
