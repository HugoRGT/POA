package modele;

public class De {
	private int v; //valeur
	
	public De () {
		v=0;
	}
	
	public void rouler() {
		v=(int)(Math.random()*6)+1;
	}
	
	int getValeur() {
		return v;
	}
}
