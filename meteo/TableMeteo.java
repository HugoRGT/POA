package meteo;
import java.util.*;

public class TableMeteo{
	private HashMap<Station, Periode> relevesStations;

	public TableMeteo(){
		relevesStations = new HashMap<Station, Periode>();
	}

	public void ajouter(Station s, Releve r){
		Periode p = relevesStations.get(s);
		if(relevesStations.containsKey(s)) {
			if(p == null) {
				Periode p2 = new Periode();
				p2.addReleve(r);
				relevesStations.put(s,p2);
			}else {
				Periode p3 = p;
				p3.addReleve(r);
				relevesStations.put(s, p3);
			}
		}else {
			Periode p2 = new Periode();
			p2.addReleve(r);
			relevesStations.put(s,p2);
		}
	}

	public void afficher(Station s){
		System.out.println(s.name());
		Periode p = relevesStations.get(s);
		System.out.println(p.toString());
	}
	
	public double temperatureMinStation(Station s) {
		Periode p = relevesStations.get(s);
		double minS = p.getTempMinStation();
		return minS;
	}
	
	public double temperatureMin() {
		double min = 1000;
		for(Station s : relevesStations.keySet()) {
			if(temperatureMinStation(s) < min) {
				min = temperatureMinStation(s);
			}
		}
		return min;
	}
}