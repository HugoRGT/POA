package tp3;

public class Tour extends Piece{
	public Tour(Position p, Color c){
		super(p,c);
	}

	public String getNom(){return "rook";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			if(Move.isVertical(this.getPos(),cible) && !Move.isHorizontal(this.getPos(),cible)){
				return true;
			}else if(Move.isHorizontal(this.getPos(),cible) && !Move.isVertical(this.getPos(),cible)){
				return true;
			}
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265C ";
		}
		return " \u2656 ";
	}
}