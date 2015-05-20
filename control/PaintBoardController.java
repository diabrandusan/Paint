package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.PaintModel;
import view.ApplicationFrame;
import ActionListener.DrawListener;

import command.AddComplexShapeCommand;
import command.ClearCommand;
import command.UndoCommand;

public class PaintBoardController {
	private PaintModel model;
	private ApplicationFrame view;

	public PaintBoardController(PaintModel model, ApplicationFrame view) {
		super();
		this.model = model;
		this.view = view;
		initListeners();
	}

	public void initListeners() {
		DrawListener listener = new DrawListener(model, view);
		view.getPaintPanel().addMouseMotionListener(listener);
		view.getPaintPanel().addMouseListener(listener);
		view.getMenuPanel().getUndo().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new UndoCommand(view, model).execute();

			}

		});

		view.getMenuPanel().getClear().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ClearCommand(view, model).execute();

			}

		});

		view.getMenuPanel().getSaveShape()
				.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						new AddComplexShapeCommand(view, model).execute();

					}

				});
	}
}
