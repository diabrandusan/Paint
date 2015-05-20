package model;

import java.awt.Color;
import java.awt.Graphics;

public class Line extends Shape {

	public Line() {
		super("Line");
	}

	public Line(int startX, int startY) {
		super("Line", startX, startY);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.drawLine(getStartX(), getStartY(), getEndX(), getEndY());
	}

}
