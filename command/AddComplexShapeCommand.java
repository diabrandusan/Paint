package command;

import javax.swing.JOptionPane;

import model.ComplexShape;
import model.PaintModel;
import model.Shape;
import view.ApplicationFrame;

public class AddComplexShapeCommand extends AbstractCommand {
	private ApplicationFrame view;
	private PaintModel model;

	public AddComplexShapeCommand(ApplicationFrame view, PaintModel model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void execute() {
		String value = JOptionPane.showInputDialog("Enter name:");
		if (value != null) {
			ComplexShape complexShape = new ComplexShape(value);
			for (Shape shape : model.getShapes()) {
				complexShape.add(shape);
			}
			model.getComplexShapes().add(complexShape);
		}
		view.repaintAll();
	}
}
