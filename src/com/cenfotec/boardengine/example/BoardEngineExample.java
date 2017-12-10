package com.cenfotec.boardengine.example;

import com.cenfotec.boardengine.board.Board;
import com.cenfotec.boardengine.board.BoardTypes;
import com.cenfotec.boardengine.board.boardfactory.BoardFactory;

public class BoardEngineExample {
	public static void main(String[] args) {
		runChessExample();
	}
	
	public static void runChessExample() {
		Board chessBoard = BoardFactory.createBoard(BoardTypes.Chess);
		
		System.out.println("Is e2-e4 a valid move? " + chessBoard.makeMove(1, 4, 3, 4));
		
	}
}