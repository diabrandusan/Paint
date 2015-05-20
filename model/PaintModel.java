package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PaintModel {
	private Stack<Shape> shapes = new Stack<Shape>();
	private List<Shape> complexShapes = new ArrayList<Shape>();

	public Stack<Shape> getShapes() {
		return shapes;
	}

	public List<Shape> getComplexShapes() {
		return complexShapes;
	}

}
