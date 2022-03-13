package tp3;

public class Reine extends Piece{
	public Reine(Position p, Color c){
		super(p,c);
	}
	
	public String getNom(){return "queen";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			if(Move.isVertical(this.getPos(),cible) && !Move.isHorizontal(this.getPos(),cible) && !Move.isDiagonal(this.getPos(),cible)){
				return true;
			}else if(Move.isHorizontal(this.getPos(),cible) && !Move.isVertical(this.getPos(),cible) && !Move.isDiagonal(this.getPos(),cible)){
				return true;
			}else if(Move.isDiagonal(this.getPos(),cible) && !Move.isHorizontal(this.getPos(),cible) && !Move.isVertical(this.getPos(),cible)){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265B ";
		}
		return " \u2655 ";
	}
}