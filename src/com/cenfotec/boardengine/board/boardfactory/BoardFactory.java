package com.cenfotec.boardengine.board.boardfactory;

import java.util.ArrayList;

import com.cenfotec.boardengine.board.Board;
import com.cenfotec.boardengine.board.BoardType;
import com.cenfotec.boardengine.piece.Piece;
import com.cenfotec.boardengine.piece.PieceType;
import com.cenfotec.boardengine.piece.piecefactory.PieceFactory;
import com.cenfotec.boardengine.player.PlayerType;

public final class BoardFactory {
	public static Board createBoard(BoardType type) {
		Board board;
		ArrayList<Piece> pieces;
		
		switch(type) {
		case Chess:
			board = new Board(8, BoardType.Chess);
			pieces = new ArrayList<Piece>();
			
			pieces.add(PieceFactory.createPiece(PieceType.King, PlayerType.White));
			pieces.add(PieceFactory.createPiece(PieceType.Queen, PlayerType.White));
			pieces.add(PieceFactory.createPiece(PieceType.Rook, PlayerType.White));
			pieces.add(PieceFactory.createPiece(PieceType.Bishop, PlayerType.White));
			pieces.add(PieceFactory.createPiece(PieceType.Knight, PlayerType.White));
			pieces.add(PieceFactory.createPiece(PieceType.Pawn, PlayerType.White));
			board.setPieces(pieces);
			
			return board;
		case Checkers:
			board = new Board(8, BoardType.Checkers);
			pieces = new ArrayList<Piece>();
			
			pieces.add(PieceFactory.createPiece(PieceType.CheckersPiece, PlayerType.White));
			board.setPieces(pieces);
			
			return board;
		default:
			return null;
		}
	}
}
