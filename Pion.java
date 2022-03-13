package tp3;

public class Pion extends Piece{
	private boolean premierMvt;

	public Pion(Position p, Color c){
		super(p,c);
		this.premierMvt = true;
	}

	public String getNom(){return "pion";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			if(this.premierMvt){
				this.premierMvt = false;
				return (Move.isVertical(this.getPos(),cible) && (Move.lengthVertical(this.getPos(),cible) == 1 || Move.lengthVertical(this.getPos(),cible) == 2));
			}
			return (Move.isVertical(this.getPos(),cible) && Move.lengthVertical(this.getPos(),cible) == 1);
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265F ";
		}
		return " \u2659 ";
	}
}