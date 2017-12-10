package com.cenfotec.boardengine.board.boardfactory;

import java.util.ArrayList;

import com.cenfotec.boardengine.board.Board;
import com.cenfotec.boardengine.board.BoardTypes;
import com.cenfotec.boardengine.piece.Piece;
import com.cenfotec.boardengine.piece.PieceTypes;
import com.cenfotec.boardengine.piece.piecefactory.PieceFactory;
import com.cenfotec.boardengine.player.PlayerTypes;

public final class BoardFactory {
	public static Board createBoard(BoardTypes type) {
		Board board;
		ArrayList<Piece> pieces;
		
		switch(type) {
		case Chess:
			board = new Board(8, BoardTypes.Chess);
			pieces = new ArrayList<Piece>();
			
			pieces.add(PieceFactory.createPiece(PieceTypes.King, PlayerTypes.White));
			pieces.add(PieceFactory.createPiece(PieceTypes.Queen, PlayerTypes.White));
			pieces.add(PieceFactory.createPiece(PieceTypes.Rook, PlayerTypes.White));
			pieces.add(PieceFactory.createPiece(PieceTypes.Bishop, PlayerTypes.White));
			pieces.add(PieceFactory.createPiece(PieceTypes.Knight, PlayerTypes.White));
			pieces.add(PieceFactory.createPiece(PieceTypes.Pawn, PlayerTypes.White));
			board.setPieces(pieces);
			
			return board;
		case Checkers:
			board = new Board(8, BoardTypes.Checkers);
			pieces = new ArrayList<Piece>();
			
			pieces.add(PieceFactory.createPiece(PieceTypes.CheckersPiece, PlayerTypes.White));
			board.setPieces(pieces);
			
			return board;
		default:
			return null;
		}
	}
}
