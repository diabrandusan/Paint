package model;

import view.ApplicationFrame;
import control.PaintBoardController;

public class Main {

	public static void main(String[] args) {
		PaintModel model = new PaintModel();
		ApplicationFrame view = new ApplicationFrame(model);
		new PaintBoardController(model, view);
	}
}
