
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class FlowerPanel extends JPanel implements MouseListener {
	private ArrayList<FlowerImage> flowers = new ArrayList<FlowerImage>();

	public FlowerPanel() {
		super();
		this.setBackground(java.awt.Color.green);
		addMouseListener(this);

	}

	public void paintComponent(java.awt.Graphics aBrush) {
		super.paintComponent(aBrush);
		Graphics2D brush = (Graphics2D) aBrush;
		for (int i = 0; i < flowers.size(); i++) {
			flowers.get(i).paint(brush);

		}
	}

	public void mouseClicked(MouseEvent e) {
		flowers.add(new FlowerImage(null, e.getPoint()));
		repaint();
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}
}