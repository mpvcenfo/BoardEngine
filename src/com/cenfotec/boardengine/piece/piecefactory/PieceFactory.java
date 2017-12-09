package com.cenfotec.boardengine.piece.piecefactory;

import com.cenfotec.boardengine.piece.Piece;
import com.cenfotec.boardengine.piece.PieceType;
import com.cenfotec.boardengine.player.PlayerType;

public final class PieceFactory {
	public static Piece createPiece(PieceType type, PlayerType player) {
		Piece piece;

		switch (type) {
		case King:
			piece = new Piece("King", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(4);
			} else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(4);
			}

			return piece;
		case Queen:
			piece = new Piece("Queen", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(3);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(3);
			}

			return piece;
		case Rook:
			piece = new Piece("Rook", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(0);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(0);
			}

			return piece;
		case Bishop:
			piece = new Piece("Bishop", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(2);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(2);
			}

			return piece;
		case Knight:
			piece = new Piece("Knight", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(1);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(1);
			}

			return piece;
		case Pawn:
			piece = new Piece("Pawn", type, player);

			if (player == PlayerType.White) {
				piece.setRow(1);
				piece.setCol(0);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(6);
				piece.setCol(0);
			}

			return piece;
		case CheckersPiece:
			piece = new Piece("CheckersPiece", type, player);

			if (player == PlayerType.White) {
				piece.setRow(0);
				piece.setCol(0);
			}

			else if (player == PlayerType.Black) {
				piece.setRow(7);
				piece.setCol(1);
			}

			return piece;
		default:
			return null;
		}
	}
}
