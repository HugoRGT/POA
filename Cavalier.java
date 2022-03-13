package tp3;

public class Cavalier extends Piece{
	public Cavalier(Position p, Color c){
		super(p,c);
	}

	public String getNom(){return "knight";}

	public boolean moveOk(Position cible){
		if(super.moveOk(cible)){
			if((Move.lengthVertical(this.getPos(),cible) == 2 || Move.lengthVertical(this.getPos(),cible) == -2) && (Move.isVertical(this.getPos(),cible))){
				if(Move.lengthHorizontal(this.getPos(),cible) == 1 || Move.lengthHorizontal(this.getPos(),cible) == -2 && (Move.isHorizontal(this.getPos(),cible))){
					return true;
				}
			}else if((Move.lengthHorizontal(this.getPos(),cible) == 2 || Move.lengthHorizontal(this.getPos(),cible) == -2) && (Move.isHorizontal(this.getPos(),cible))){
				if(Move.lengthVertical(this.getPos(),cible) == 1 || Move.lengthVertical(this.getPos(),cible) == -1 && (Move.isVertical(this.getPos(),cible))){
					return true;
				}
			}else if((Move.lengthHorizontal(this.getPos(),cible) == 1 || Move.lengthHorizontal(this.getPos(),cible) == -1) && (Move.isHorizontal(this.getPos(),cible))){
				if(Move.lengthVertical(this.getPos(),cible) == 2 || Move.lengthVertical(this.getPos(),cible) == -2 && (Move.isVertical(this.getPos(),cible))){
					return true;
				}
			}else if((Move.lengthVertical(this.getPos(),cible) == 1 || Move.lengthVertical(this.getPos(),cible) == -1) && (Move.isVertical(this.getPos(),cible))){
				if(Move.lengthHorizontal(this.getPos(),cible) == 2 || Move.lengthHorizontal(this.getPos(),cible) == -2 && (Move.isHorizontal(this.getPos(),cible))){
					return true;
				}
			}
		}
		return false;
	}

	public String toString(){
		if(super.getColor() == Color.BLACK){
			return " \u265E ";
		}
		return " \u2658 ";
	}
}