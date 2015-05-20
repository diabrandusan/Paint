package command;

import model.PaintModel;
import view.ApplicationFrame;

public class UndoCommand extends AbstractCommand {
	private ApplicationFrame view;
	private PaintModel model;

	public UndoCommand(ApplicationFrame view, PaintModel model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void execute() {
		if (!model.getShapes().isEmpty()) {
			model.getShapes().pop();
		}
		view.repaintAll();
	}
}
