package chess_game;

public class Move{
	public static boolean isDiagonal(Position From,Position to){
		int xDiff = to.getCol() - From.getCol();
		int yDiff = to.getRow() - From.getRow();
		if(xDiff == yDiff || xDiff == -yDiff){
			return true;
		}
		return false;
	}

	public static boolean isVertical(Position From,Position to){
		return From.getCol() == to.getCol();
	}

	public static boolean isHorizontal(Position From,Position to){
		return From.getRow() == to.getRow();
	}

	public static int lengthVertical(Position From,Position to){
		return to.getRow()-From.getRow();
	}

	public static int lengthHorizontal(Position From,Position to){
		return to.getCol()-From.getCol();
	}
}