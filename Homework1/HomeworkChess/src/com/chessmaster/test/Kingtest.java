package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.King;

public class Kingtest {

	public static void OneSquereDiagonalMove() {

		System.out.print("King - OneSquareDiagonalMove  - ");

		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 8, 1);

		// 2. Act  Assert
		boolean isValid = testKing.isMovePosible(2, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

    public static void OneSquareForwardMove() {

		System.out.print("King - OneSquareForwardMove  - ");

		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 3, 0);

		// 2. Act  Assert
		boolean isValid = testKing.isMovePosible(3, 1);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

    public static void OneSquareSiteMove() {

	System.out.print("King - OneSquareSiteMove  - ");

	// 1. Arrange
	King testKing = new King(PieceColor.BLACK, 3, 0);

	// 2. Act - Assert
	boolean isValid = testKing.isMovePosible(4, 0);
	String testMessage = (isValid) ? "Valid" : "Fail"; 
	System.out.println(testMessage);
}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("King - IfMoveOverTwoSquereIsNotPosible  - ");		

		// 1. Arrange
		King testKing = new King(PieceColor.BLACK, 8, 0);

		// 2. Act - Assert
		boolean isValid = (testKing.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}

	public static void run() {

		OneSquereDiagonalMove();
		OneSquareSiteMove();
		OneSquareForwardMove();
	}

}