/**
 * 
 */
package edu.miamioh.paxtoncr;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * @author Chris
 *
 */
public class NQueensFrame extends JFrame{
	
	public NQueensFrame(){
		add(new NQueensBoardPanel());
	}

}
