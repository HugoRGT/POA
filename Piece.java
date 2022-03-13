package tp3;

public abstract class Piece{
	private Position pos;
	private Color color;

	public Piece(Position pos,Color col){
		this.pos = pos;
		this.color = col;
	}

	public Position getPos(){
		return this.pos;
	}

	public Color getColor(){
		return this.color;
	}

	abstract String getNom();

	public boolean moveOk(Position cible){
		return cible.isValid();
	}
}