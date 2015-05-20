package model;

import java.awt.Graphics;

public abstract class Shape {
	private String name;
	private int startX;
	private int startY;
	private int endX;
	private int endY;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public Shape(String name, int startX, int startY) {
		super();
		this.name = name;
		this.startX = startX;
		this.startY = startY;
	}

	public abstract void draw(Graphics g);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	@Override
	public String toString() {
		return name;
	}
}
