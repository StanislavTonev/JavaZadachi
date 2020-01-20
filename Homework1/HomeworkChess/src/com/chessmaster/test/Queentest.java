package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Queen;

public class Queentest {

	public static void FourSquareDiagonalMove() {

		System.out.print("Queen - FourSquereDiagonalMove  - ");

		// 1. Arrange
		Queen testQueen = new Queen(PieceColor.BLACK, 1, 0);

		// 2. Act  Assert
		boolean isValid = testQueen.isMovePosible(4, 5);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

public static void FourSquareForwardMove() {

		System.out.print("Queen - FourSquereForwardMove  - ");

		// 1. Arrange
		Queen testQueen = new Queen(PieceColor.BLACK, 2, 0);

		// 2. Act  Assert
		boolean isValid = testQueen.isMovePosible(2, 4);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

public static void FourSquareSideMove() {

	System.out.print("Queen - FourSquereSiteMove  - ");

	// 1. Arrange
	Queen testQueen = new Queen(PieceColor.BLACK, 1, 3);

	// 2. Act  Assert
	boolean isValid = testQueen.isMovePosible(5, 3);
	String testMessage = (isValid) ? "Valid" : "Fail"; 
	System.out.println(testMessage);
}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Queen - testIfMoveOverTwoSquereIsNotPosible  - ");		

		// 1. Arrange
		Queen testQueen = new Queen(PieceColor.BLACK, 8, 0);

		// 2. Act - Assert
		boolean isValid = (testQueen.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}

	public static void run() {

		FourSquareDiagonalMove();
		FourSquareForwardMove();
		FourSquareSideMove();
	}

}