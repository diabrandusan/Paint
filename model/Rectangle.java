package model;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape {

	public Rectangle() {
		super("Rectangle");
	}

	public Rectangle(int startX, int startY) {
		super("Rectangle", startX, startY);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawRect(getStartX(), getStartY(), Math.abs(getStartX() - getEndX()),
				Math.abs(getStartY() - getEndY()));
	}
}