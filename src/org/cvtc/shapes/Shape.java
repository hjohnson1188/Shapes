package org.cvtc.shapes;

/**
 * @author Heather
 *
 */

public class Shape {
	
	private MessageBox Dialog;
	

	public float surfaceArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float volume() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void render() {
		// TODO Auto-generated method stub
		
	}

	protected MessageBox getDialog() {
		return Dialog;
	}

	private void setDialog(MessageBox dialog) {
		Dialog = dialog;
	}
	
	public Shape(MessageBox Dialog) {
		
	}

}
