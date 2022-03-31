package meteo;

public class Date{
	private int jour;
	private int mois;
	private int annee;

	public Date(int j,int m,int a){
		this.jour = j;
		this.mois = m;
		this.annee = a;
	}

	public int getJour(){
		return this.jour;
	}
	public int getMois(){
		return this.mois;
	}
	public int getAnnee(){
		return this.annee;
	}
	
	public String toString() {
		return ""+this.jour+" "+this.mois+" "+this.annee;
	}
}