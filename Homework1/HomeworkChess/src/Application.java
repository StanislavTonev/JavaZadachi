import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.*;
import com.chessmaster.test.Bishoptest;
import com.chessmaster.test.Kingtest;
import com.chessmaster.test.Knighttest;
import com.chessmaster.test.PawnTest;
import com.chessmaster.test.Queentest;
import com.chessmaster.test.Rooktest;

public class Application {

	public static void main(String[] args) {

		PawnTest.run();
		Kingtest.run();
		Queentest.run();
		Rooktest.run();
		Bishoptest.run();
		Knighttest.run();
	}
}