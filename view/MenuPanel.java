package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import model.PaintModel;
import model.Shape;

public class MenuPanel extends JPanel {

	private static final long serialVersionUID = 3461701037784092300L;
	private JList<String> list;
	private PaintModel model;
	private DefaultListModel<String> listModel;
	private JButton undo;
	private JButton saveShape;
	private JButton clear;

	public MenuPanel(PaintModel model) {
		initComponenteMain();
		setBounds(730, 0, 300, 600);
		this.model = model;
	}

	private void initComponenteMain() {
		setLayout(null);
		setBackground(Color.BLACK);
		JLabel message1 = new JLabel("Drawing");
		message1.setBounds(0, 0, 100, 50);
		message1.setForeground(Color.red);
		message1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		message1.setVisible(true);

		listModel = new DefaultListModel<>();
		listModel.addElement("Line");
		listModel.addElement("Square");
		listModel.addElement("Rectangle");
		listModel.addElement("Circle");

		list = new JList<>(listModel);
		list.setBackground(Color.BLACK);
		list.setForeground(Color.WHITE);
		list.setBounds(0, 50, 200, 300);
		list.setSelectedIndex(0);
		add(list);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		add(list);
		add(message1);

		clear = new JButton("Clear");
		clear.setBounds(20, 400, 100, 30);
		undo = new JButton("Undo");
		undo.setBounds(20, 450, 100, 30);
		saveShape = new JButton("Save shape");
		saveShape.setBounds(20, 500, 100, 30);
		add(clear);
		add(undo);
		add(saveShape);

	}

	public void repaintPanel() {
		int selectedIndex = list.getSelectedIndex();
		listModel.clear();
		listModel.addElement("Line");
		listModel.addElement("Square");
		listModel.addElement("Rectangle");
		listModel.addElement("Circle");
		for (Shape shape : model.getComplexShapes()) {
			listModel.addElement(shape.toString());
		}
		list.setSelectedIndex(selectedIndex);
		this.revalidate();
		this.repaint();
	}

	public JList<String> getList() {
		return list;
	}

	public void setList(JList<String> list) {
		this.list = list;
	}

	public PaintModel getModel() {
		return model;
	}

	public void setModel(PaintModel model) {
		this.model = model;
	}

	public JButton getUndo() {
		return undo;
	}

	public void setUndo(JButton undo) {
		this.undo = undo;
	}

	public JButton getSaveShape() {
		return saveShape;
	}

	public void setSaveShape(JButton saveShape) {
		this.saveShape = saveShape;
	}

	public JButton getClear() {
		return clear;
	}

	public void setClear(JButton clear) {
		this.clear = clear;
	}

}
