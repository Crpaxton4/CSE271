/**
 * 
 */
package edu.miamioh.paxtoncr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * @author Chris
 *
 */
public class NQueensBoardPanel extends JPanel{

	int n = 8;
	
	private NQueensTilePanel[][] board = new NQueensTilePanel[n][n];
	
	
	
	public NQueensBoardPanel(){
		setLayout(new GridLayout(n,  n));
		makeBoard();
		addBoard();
		
	}
	
	private void addBoard() {
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				add(board[i][j], i, j);
			}
		}
		
	}

	private void makeBoard(){
		
		boolean color = true;
		
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[i].length; j++){
				NQueensTilePanel tile = new NQueensTilePanel(color);
				board[i][j] = tile;
				color = !color;
			}
			color = !color;
		}
	}

}
