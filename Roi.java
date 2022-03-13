package tp3;

public class Roi extends Piece{
	public Roi(Position p, Color c){
		super(p,c);
	}

	public String getNom(){return "king";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			if(Move.isVertical(this.getPos(),cible) && !Move.isHorizontal(this.getPos(),cible) && !Move.isDiagonal(this.getPos(),cible) && (Move.lengthVertical(this.getPos(),cible) == 1)){
				return true;
			}else if(Move.isHorizontal(this.getPos(),cible) && !Move.isVertical(this.getPos(),cible) && !Move.isDiagonal(this.getPos(),cible) && (Move.lengthHorizontal(this.getPos(),cible) == 1)){
				return true;
			}else if(Move.isDiagonal(this.getPos(),cible) && !Move.isHorizontal(this.getPos(),cible) && !Move.isVertical(this.getPos(),cible) && (Move.lengthVertical(this.getPos(),cible) == 1 && Move.lengthHorizontal(this.getPos(),cible) == 1)){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265A ";
		}
		return " \u2654 ";
	}
}