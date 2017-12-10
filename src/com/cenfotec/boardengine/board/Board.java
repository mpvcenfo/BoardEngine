package com.cenfotec.boardengine.board;

import java.util.ArrayList;

import com.cenfotec.boardengine.piece.Piece;

public class Board {
	private int size;
	private BoardTypes type;
	private ArrayList<Piece> pieces;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public BoardTypes getType() {
		return type;
	}
	public void setType(BoardTypes type) {
		this.type = type;
	}
	public ArrayList<Piece> getPieces() {
		return pieces;
	}
	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}
	
	public Board(int size, BoardTypes type) {
		this.size = size;
		this.type = type;
		this.pieces = new ArrayList<Piece>();
	}
	
	public boolean makeMove(int sourceRow, int sourceCol, int targetRow, int targetCol) {
		boolean validMove = false;
		
		Piece piece = findPiece(sourceRow, sourceCol);
		
		piece.movePiece(sourceRow, sourceCol, targetRow, targetCol);
		
		
		
		return validMove;
	}
	
	private Piece findPiece(int row, int col) {
		Piece piece = null;
		
		for(Piece p: pieces) {
			if(p.getRow() == row && p.getCol() == col) {
				piece = p;
			}
		}
		
		return piece;
	}
}
