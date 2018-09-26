package org.cvtc.shapes;

/**
 * @author Heather
 *
 */

public class Shape {
	
	protected Dialog dialog;
	public Shape(Dialog dialog) {
		this.dialog = dialog;
	}
	public void render() {
		return;
	}
	public float surfaceArea() {
		return 0;
	}

	public float volume() {
		return 0;
	}

}
