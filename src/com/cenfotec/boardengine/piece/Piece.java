package com.cenfotec.boardengine.piece;

import com.cenfotec.boardengine.movements.IMovement;
import com.cenfotec.boardengine.player.PlayerTypes;

public class Piece implements IMovePiece {
	protected int row;
	protected int col;
	protected PlayerTypes player;
	protected String name;
	protected IMovement movement;
	protected PieceTypes type;
	
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
	
	public Piece(String name, PieceTypes type, PlayerTypes player) {
		this.name = name;
		this.type = type;
		this.player = player;
	}
	
	public void movePiece(int sourceRow, int sourceCol, int targetRow, int targetCol) {
		this.movement.movePiece(sourceRow, sourceCol, targetRow, targetCol);
	}
}