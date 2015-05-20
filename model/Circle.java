package model;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape {

	public Circle() {
		super("Circle");
	}

	public Circle(int startX, int startY) {
		super("Circle", startX, startY);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		int diameter = (int) Math
				.sqrt(Math
						.abs(((getStartX() - getEndX()) * (getStartX() - getEndX()))
								+ ((getStartY() - getEndY()) * (getStartY() - getEndY()))));
		int radius = diameter / 2;
		g.drawOval(getStartX() - radius, getStartY() - radius, diameter,
				diameter);
	}
}
