package tp3;

public class ChessPlate{
	private Piece[][]plate;

	public ChessPlate(){
		this.plate = new Piece[8][8];
		createPlate();
	}

	public void createPlate(){
		for(int i = 0; i < this.plate.length; i++){
			for(int j = 0; j < this.plate[0].length; i++){
				Position p = new Position(i,j);

				if(i == 0 && j == 0 ||  i == 0 && j == this.plate[0].length){
					plate[i][j] = new Tour(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length && j == 0 || i == this.plate.length && j == this.plate[0].length){
					plate[i][j] = new Tour(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 1 || i == 0 && j == this.plate[0].length - 1){
					plate[i][j] = new Cavalier(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length && j == 1 || i == this.plate.length && j == this.plate[0].length - 1){
					plate[i][j] = new Cavalier(p,Color.BLACK);
					continue;
				}

				if(i == 0 && j == 2 || i == 0 && j == this.plate[0].length-2){
					plate[i][j] = new Fou(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length && j == 2 || i == this.plate.length && j == this.plate[0].length - 2){
					plate[i][j] = new Fou(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 3){
					plate[i][j] = new Reine(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length && j == 3){
					plate[i][j] = new Reine(p,Color.WHITE);
					continue;
				}

				if(i == 0 && j == 4){
					plate[i][j] = new Roi(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length && j == 4){
					plate[i][j] = new Roi(p,Color.WHITE);
					continue;
				}

				if(i == 2){
					plate[i][j] = new Pion(p,Color.BLACK);
					continue;
				}
				if(i == this.plate.length-1){
					plate[i][j] = new Pion(p,Color.WHITE);
					continue;
				}

				plate[i][j] = null;
			}
		}
	}

	public void displayPlate(){
		for(int i = 0; i < this.plate.length; i++){
			for(int j = 0; j < this.plate[0].length; j++){
				if(this.plate[i][j] == null){
					System.out.println(" . ");
				}
				System.out.print(this.plate[i][j].toString());
			}
			System.out.println();
		}
	}
}