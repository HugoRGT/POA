package chess_game;
import java.util.*;

public class Chess{
	public void Move() {
		
	}
	
	public static void main(String[]args){
		ChessPlate p = new ChessPlate();
		p.displayPlate();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter x coordinate of the piece you want to move : ");
		int fromX = sc.nextInt();
		System.out.print("Enter y coordinate of the piece you want to move : ");
		int fromY = sc.nextInt();
		
		System.out.print("Enter x coordinate of where you want to move : ");
		int toX = sc.nextInt();
		System.out.print("Enter y coordinate of where you want to move : ");
		int toY = sc.nextInt();
		
		System.out.println();
		p.Move(fromX, fromY, toX, toY);
		
		p.displayPlate();
	}
}