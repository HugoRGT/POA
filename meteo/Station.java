package meteo;

public class Station{
	private String ville;
	private int postal;

	public Station(String ville, int postal){
		this.ville = ville;
		this.postal = postal;
	}
	
	public String name() {
		return this.ville;
	}
}