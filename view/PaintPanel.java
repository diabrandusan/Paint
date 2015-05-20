package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

import model.PaintModel;
import model.Shape;

public class PaintPanel extends JPanel {

	private static final long serialVersionUID = 6427559347084729386L;
	private PaintModel model = new PaintModel();

	public PaintPanel(PaintModel model) {
		initComponenteMain();
		this.model = model;
	}

	private void initComponenteMain() {
		setLayout(null);
		setBounds(0, 0, 700, 600);
		setBackground(Color.white);
		setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Shape shape : model.getShapes()) {
			shape.draw(g);
		}
	}

	public void repaintPanel() {
		this.revalidate();
		this.repaint();
	}
}
