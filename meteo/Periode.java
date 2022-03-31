package meteo;
import java.util.*;

public class Periode{
	private TreeSet<Releve>trReleve;

	public Periode(){
		trReleve = new TreeSet<Releve>();
	}

	public void addReleve(Releve r){
		trReleve.add(r);
	}
	
	public String stringReleve() {
		Iterator<Releve>it = this.trReleve.iterator();
		String res = "";
		while(it.hasNext()) {
			res += "[(" + it + ")]\n";
			it.next();
		}
		return res;
	}
}