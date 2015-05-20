package ActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import model.Circle;
import model.Line;
import model.PaintModel;
import model.Rectangle;
import model.Shape;
import model.Square;
import view.ApplicationFrame;

public class DrawListener implements MouseMotionListener, MouseListener {

	private PaintModel model;
	private ApplicationFrame view;
	private Shape newShape;

	public DrawListener(PaintModel model, ApplicationFrame view) {
		super();
		this.model = model;
		this.view = view;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {

	}

	@Override
	public void mouseExited(MouseEvent arg0) {

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		String selectedValue = view.getMenuPanel().getList().getSelectedValue();
		if (selectedValue == null) {
			return;
		}
		if (selectedValue.equals("Line")) {
			newShape = new Line();
		} else if (selectedValue.equals("Circle")) {
			newShape = new Circle();
		} else if (selectedValue.equals("Rectangle")) {
			newShape = new Rectangle();
		} else if (selectedValue.equals("Square")) {
			newShape = new Square();
		} else {
			for (Shape shape : model.getComplexShapes()) {
				if (shape.getName().equals(selectedValue)) {
					newShape = shape;
				}
			}
		}
		if (newShape == null) {
			return;
		}
		newShape.setStartX(arg0.getPoint().x);
		newShape.setStartY(arg0.getPoint().y);
		newShape.setEndX(arg0.getPoint().x);
		newShape.setEndY(arg0.getPoint().y);
		model.getShapes().add(newShape);
		view.repaintAll();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		newShape.setEndX(arg0.getPoint().x);
		newShape.setEndY(arg0.getPoint().y);
		view.repaintAll();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {

	}

}
