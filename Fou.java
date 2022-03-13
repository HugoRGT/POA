package tp3;

public class Fou extends Piece{
	public Fou(Position p, Color c){
		super(p,c);
	}

	public String getNom(){return "bishop";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			return Move.isDiagonal(this.getPos(),cible);
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265D ";
		}
		return " \u2657 ";
	}
}