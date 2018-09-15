package org.cvtc.shapes.test;

import static org.junit.Assert.*;

import org.cvtc.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

	@Test
	public void testSurfaceArea() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(1, sphere1.surfaceArea(), 0.0002);
	}

	@Test
	public void testVolume() {
		Sphere sphere1 = new Sphere(1);
		assertEquals(1, sphere1.volume(), 0.0002);
	}

	@Test
	public void testGetRadius() {
		Sphere sphere1 = new Sphere(3);
		assertEquals(3, sphere1.getRadius(), 0.0002);
	}

	@Test //(expected = IllegalArgumentException.class)
	public void testSphere() {
		Sphere sphere1 = new Sphere(5);
	}

}