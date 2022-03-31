package meteo;

public class Releve implements Comparable <Releve>{
	private Date date;
	private double tempMin;
	private double tempMax;

	public Releve(Date date,double min, double max){
		this.date = date;
		this.tempMin = min;
		this.tempMax = max;
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Releve))
			return false;
		Releve other = (Releve) o;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		return true;
	}
	
	public int compareTo(Releve r) {
		return this.date.toString().compareTo(r.date.toString());
	}

	public String getDate() {
		return date.toString();
	}

	public double getTempMin() {
		return tempMin;
	}

	public double getTempMax() {
		return tempMax;
	}
}