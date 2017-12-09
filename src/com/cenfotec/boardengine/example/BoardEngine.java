package com.cenfotec.boardengine.example;

import java.util.ArrayList;
import com.cenfotec.boardengine.board.Board;
import com.cenfotec.boardengine.board.BoardType;
import com.cenfotec.boardengine.piece.Piece;

public class BoardEngine {
	public static void main(String[] args) {
		runChessExample();
		runCheckersExample();
	}
	
	public static void runChessExample() {
		Board chessBoard = new Board(8, BoardType.Chess);
		ArrayList<Piece> chessPieces = new ArrayList<Piece>();
		chessBoard.setPieces(chessPieces);
	}
	
	public static void runCheckersExample() {
		Board checkersBoard = new Board(8, BoardType.Checkers);
		ArrayList<Piece> checkersPieces = new ArrayList<Piece>();
		checkersBoard.setPieces(checkersPieces);
	}
}