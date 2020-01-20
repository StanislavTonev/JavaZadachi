package com.chessmaster.test;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Rook;

public class Rooktest {

	public static void ForwardMove() {

		System.out.print("Rook - ForwardMove  - ");

		// 1. Arrange
		Rook testRook = new Rook(PieceColor.BLACK, 7, 0);

		// 2. Act  Assert
		boolean isValid = testRook.isMovePosible(1, 5);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

    public static void SiteMove() {

		System.out.print("Rook - SiteMove  - ");

		// 1. Arrange
		Rook testRook = new Rook(PieceColor.BLACK, 1, 0);

		// 2. Act  Assert
		boolean isValid = testRook.isMovePosible(7, 0);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);
	}

	public static void testIfMoveOverTwoSquereIsNotPosible() {

		System.out.print("Rook - testIfMoveOverTwoSquereIsNotPosible  - ");		

		// 1. Arrange
		Rook testRook = new Rook(PieceColor.BLACK, 8, 0);

		// 2. Act  Assert
		boolean isValid = (testRook.isMovePosible(6, 0) == false);
		String testMessage = (isValid) ? "Valid" : "Fail"; 
		System.out.println(testMessage);		
	}

	public static void run() {

		ForwardMove();
		SiteMove();
	}

}