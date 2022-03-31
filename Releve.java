package tp6;
import java.util.*;

public class Releve implements Comparable <Releve>{
	private Date date;
	private double tempMin;
	private double tempMax;

	public Releve(Date date,double min, double max){
		this.date = date;
		this.tempMin = min;
		this.tempMax = max;
	}

	public boolean equals(Object o){
		if(! (o instanceof Releve)){
			return false;
		}
		Releve r = (Releve)o;
		return this.date.getJour() == o.date.getJour() && this.date.getMois() == o.date.getMois() && this.date.getAnnee() == o.date.getAnnee();
	}

	public int compareTo(Releve other){
		return this.date - other.date;
	}
}