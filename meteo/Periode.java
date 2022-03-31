package meteo;
import java.util.*;

public class Periode{
	private TreeSet<Releve>trReleve;

	public Periode(){
		trReleve = new TreeSet<Releve>();
	}

	public boolean addReleve(Releve r){
		return this.trReleve.add(r);
	}
	
	public String toString() {
		Iterator<Releve>it = this.trReleve.iterator();
		String res = "";
		while(it.hasNext()) {
			Releve r = it.next();
			res = res + r.toString();
		}
		return res;
	}
	
	public double getTempMinStation() {
		Iterator<Releve>it = this.trReleve.iterator();
		double min = 10000;
		while(it.hasNext()) {
			Releve r = it.next();
			if(min > r.getTempMin()) {
				min = r.getTempMin();
			}
		}
		return min;
	}
}