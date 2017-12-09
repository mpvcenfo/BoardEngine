package com.cenfotec.boardengine.board;

public class Piece implements IMovePiece {
	private int row;
	private int col;
	private String name;
	
	
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move() {
		
	}
}
