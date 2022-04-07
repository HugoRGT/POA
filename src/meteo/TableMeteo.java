package meteo;
import java.util.*;

public class TableMeteo{
	private HashMap<Station, Periode> relevesStations;

	public TableMeteo(){
		relevesStations = new HashMap<Station, Periode>();
	}

	public void ajouter(Station s, Releve r){
		Periode p = relevesStations.get(s);
		if(p == null){
			p.addReleve(r);
			relevesStations.put(s,p);
		}else{
			p = relevesStations.get(s);
			System.out.println(p.addReleve(r));
		}
	}

	public void afficher(Station s){
		System.out.println(s.name());
		Periode p = relevesStations.get(s);
		System.out.println(p.toString());
	}
	
	public double temperatureMinStation(Station s) {
		Periode p = relevesStations.get(s);
		double min = p.getTempMinStation();
		return min;
	}
}