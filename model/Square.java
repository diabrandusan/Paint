package model;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape {

	public Square() {
		super("Square");
	}

	public Square(int startX, int startY) {
		super("Square", startX, startY);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		int average = (Math.abs(getStartX() - getEndX()) + Math.abs(getStartY()
				- getEndY())) / 2;
		g.drawRect(getStartX(), getStartY(), average, average);
	}
}