package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Bishop;

public class Bishoptest {

	public static void DiagonalMovement() {

		System.out.print("Bishop - DiagonalMovement  - ");

		// 1. Arrange
		Bishop testPawn = new Bishop(PieceColor.BLACK, 1, 0);

		// 2. Act Assert
		boolean isValid = testPawn.isMovePosible(5, 4);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Bishop - testIfMoveOverTwoSquereIsNotPosible  - ");		

		// 1. Arrange
		Bishop testPawn = new Bishop(PieceColor.BLACK, 8, 0);

		// 2. Act Assert
		boolean isValid = (testPawn.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}

	public static void run() {

		DiagonalMovement();
	}
}
