package tp6;
import java.util.*;

public class Periode{
	private TreeSet<Releve>trReleve;

	public Periode(){
		trReleve = new TreeSet<Releve>();
	}

	public void addReleve(Releve r){
		trReleve.add(r);
	}
}