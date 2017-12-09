package com.cenfotec.boardengine.board;

import java.util.ArrayList;

import com.cenfotec.boardengine.piece.Piece;

public class Board {
	private int size;
	private BoardType type;
	private ArrayList<Piece> pieces;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public BoardType getType() {
		return type;
	}
	public void setType(BoardType type) {
		this.type = type;
	}
	public ArrayList<Piece> getPieces() {
		return pieces;
	}
	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
	
	public Board(int size, BoardType type) {
		this.size = size;
		this.type = type;
	}
}
