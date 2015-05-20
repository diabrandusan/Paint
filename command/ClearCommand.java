package command;

import model.PaintModel;
import view.ApplicationFrame;

public class ClearCommand extends AbstractCommand {
	private ApplicationFrame view;
	private PaintModel model;

	public ClearCommand(ApplicationFrame view, PaintModel model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void execute() {
		model.getShapes().clear();
		view.repaintAll();
	}
}
