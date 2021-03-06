package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Knight;

public class Knighttest {

	public static void testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward() {

		System.out.print("Knight - test  - ");

		// 1. Arrange
		Knight testPawn = new Knight(PieceColor.BLACK, 1, 0);

		// 2. Act - Assert
		boolean isValid = testPawn.isMovePosible(2, 2);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Knight - testIfMoveOverTwoSquereIsNotPosible  - ");		

		// 1. Arrange
		Knight testPawn = new Knight(PieceColor.BLACK, 8, 0);

		// 2. Act - Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}

	public static void run() {

		testIfTheMoveMethodPositionThePieceCorrectlyOneSquereForward();
	}

}
