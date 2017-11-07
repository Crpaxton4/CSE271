/**
 * 
 */
package edu.miamioh.paxtoncr;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Chris
 *
 */
public class NQueensTilePanel extends JPanel {
	
	private Color backgroundColor;
	private JLabel queen = new JLabel();
	
	private class TileListener implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			try {
				toggleQueen();
			} catch (IOException e1) {
				//meh
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {}

		@Override
		public void mouseExited(MouseEvent e) {}

		@Override
		public void mousePressed(MouseEvent e) {}

		@Override
		public void mouseReleased(MouseEvent e) {}
		
	}

	public NQueensTilePanel(boolean color){
		if(color)
			backgroundColor = Color.BLACK;
		else
			backgroundColor = Color.WHITE;
		
		setVisible(true);
		setBackground(backgroundColor);
	}
	
	private void toggleQueen() throws IOException {
		// TODO changes if there is a queen in the tile of not.
		BufferedImage queenPic = ImageIO.read(new File("QueenImg.jpg"));
		if(queen.getIcon() != null)
			queen.setIcon(null);
		else
			queen.setIcon(new ImageIcon(queenPic));
		add(queen);
		repaint();
	}
	
}
