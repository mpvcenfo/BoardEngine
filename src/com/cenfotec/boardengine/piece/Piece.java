package com.cenfotec.boardengine.piece;

import com.cenfotec.boardengine.movements.IMovement;
import com.cenfotec.boardengine.player.PlayerType;

public class Piece implements IMovePiece {
	private int row;
	private int col;
	private PlayerType player;
	private String name;
	private IMovement movement;
	private PieceType type;
	
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
	
	public Piece(String name, PieceType type, PlayerType player) {
		this.name = name;
		this.type = type;
		this.player = player;
	}
	
	public void movePiece() {
		this.movement.movePiece();
	}
}