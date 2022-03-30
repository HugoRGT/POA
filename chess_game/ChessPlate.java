package chess_game;

public class ChessPlate{
	private Piece[][]plate;

	public ChessPlate(){
		this.plate = new Piece[8][8];
		createPlate();
	}

	public void createPlate(){
		for(int i = 0; i < this.plate[0].length; i++){
			for(int j = 0; j < this.plate.length; j++){
				Position p = new Position(i,j);

				if(i == 0 && j == 0 ||  i == 0 && j == this.plate.length-1){
					this.plate[i][j] = new Tour(p,Color.BLACK);
					continue;
				}
				if(i == this.plate[0].length-1 && j == 0 || i == this.plate[0].length-1 && j == this.plate.length-1){
					this.plate[i][j] = new Tour(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 1 || i == 0 && j == this.plate[0].length - 2){
					this.plate[i][j] = new Cavalier(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-1 && j == 1 || i == this.plate.length-1 && j == this.plate[0].length - 2){
					this.plate[i][j] = new Cavalier(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 2 || i == 0 && j == this.plate[0].length - 3){
					this.plate[i][j] = new Fou(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-1 && j == 2 || i == this.plate.length-1 && j == this.plate[0].length - 3){
					this.plate[i][j] = new Fou(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 3){
					this.plate[i][j] = new Reine(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-1 && j == 3){
					this.plate[i][j] = new Reine(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 4){
					this.plate[i][j] = new Roi(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-1 && j == 4){
					this.plate[i][j] = new Roi(p,Color.WHITE);
					continue;
				}

				if(i == 1){
					this.plate[i][j] = new Pion(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-2){
					this.plate[i][j] = new Pion(p,Color.WHITE);
					continue;
				}

				this.plate[i][j] = null;
			}
		}
	}

	public void displayPlate(){
		for(int i = 0; i < this.plate[0].length; i++){
			for(int j = 0; j < this.plate.length; j++){
				if(this.plate[i][j] == null){
					System.out.print(" ..... ");
					continue;
				}
				System.out.print(this.plate[i][j].toString());
			}
			System.out.println();
			System.out.println();
		}
	}
	
	
	public void Move(int fromX,int fromY,int toX,int toY) {
		Position from = new Position(fromY,fromX);
		Position to = new Position(toY,toX);
		
		if(this.plate[fromY][fromX].moveOk(to) && this.plate[toY][toX] == null) {
			this.plate[toY][toX] = this.plate[fromY][fromX];
			this.plate[fromY][fromX] = null;
			return;
		}
		System.out.println("There's a piece in this cell or you're out of the plate bounds");
		System.out.println();
	}
}