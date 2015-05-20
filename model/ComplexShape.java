package model;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ComplexShape extends Shape {

	public ComplexShape(String name) {
		super(name);
	}

	private final List<Shape> childShape = new ArrayList<Shape>();

	@Override
	public void draw(Graphics g) {
		for (Shape shape : childShape) {
			shape.draw(g);
		}
	}

	public void add(Shape shape) {
		childShape.add(shape);
	}

	public void remove(Shape shape) {
		childShape.remove(shape);
	}

}