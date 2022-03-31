package tp6;

import java.util.*;

public class TableMeteo{
	private HashMap<Station, Periode> relevesStations;

	public TableMeteo(){
		relevesStations = new HashMap<Station, Periode>();
	}

	public void ajouter(Station s, Releve r){
		Periode p = new Periode();
		if(!relevesStations.containsKey(s)){
			p.addReleve(r);
			relevesStations.put(s,p);
		}else{
			p = relevesStations.get(s);
			relevesStations.put(s,p);
		}
	}


	public void afficher(Station s){
		System.out.println(relevesStations.get(s));
	}
}