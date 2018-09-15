package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

	@Test
	public void testSurfaceArea() {
		Cylinder cylinder1 = new Cylinder(2,5);
		assertEquals(1, cylinder1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Cylinder cylinder1 = new Cylinder(2,5);
		assertEquals(1, cylinder1.volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Cylinder cylinder1 = new Cylinder(2,5);
		assertEquals(1, cylinder1.getRadius(), 0.0002);;
	}

	@Test
	public void testGetHeight() {
		Cylinder cylinder1 = new Cylinder(2,5);
		assertEquals(1, cylinder1.getHeight(), 0.0002);;
	}

	@Test //(expected = IllegalArgumentException.class)
	public void testCylinder() {
		Cylinder cylinder1 = new Cylinder(2,3);
	}

}
