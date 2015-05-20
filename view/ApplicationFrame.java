package view;

import java.awt.Color;

import javax.swing.JFrame;

import model.PaintModel;

public class ApplicationFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private MenuPanel menuPanel;
	private PaintPanel paintPanel;

	public ApplicationFrame(PaintModel model) {

		this.setSize(1000, 600);
		setTitle("Drawing");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		getContentPane().setBackground(Color.darkGray);
		paintPanel = new PaintPanel(model);
		menuPanel = new MenuPanel(model);
		setFocusable(true);
		initComponenteMain();
		setVisible(true);

	}

	public void repaintAll() {
		paintPanel.repaintPanel();
		menuPanel.repaintPanel();
	}

	private void initComponenteMain() {
		getContentPane().add(paintPanel);
		getContentPane().add(menuPanel);
		getContentPane().setBackground(Color.black);
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public PaintPanel getPaintPanel() {
		return paintPanel;
	}

	public void setPaintPanel(PaintPanel paintPanel) {
		this.paintPanel = paintPanel;
	}

}
