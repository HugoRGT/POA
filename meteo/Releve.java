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
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Releve other = (Releve) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (Double.doubleToLongBits(tempMax) != Double.doubleToLongBits(other.tempMax))
			return false;
		if (Double.doubleToLongBits(tempMin) != Double.doubleToLongBits(other.tempMin))
			return false;
		return true;
	}
	
	public int compareTo(Releve r) {
		String thisDate = ""+this.date.getAnnee()+this.date.getMois()+this.date.getJour(); //this.date.toString();
		String rDate = ""+r.date.getAnnee()+r.date.getMois()+r.date.getJour(); //r.date.toString();
		int thisDateInt = Integer.valueOf(thisDate);
		int rDateInt = Integer.valueOf(rDate);
		return thisDateInt-rDateInt;
	}

	public String toString() {
		return "[("+this.date.toString()+") : "+this.tempMin+" - "+this.tempMax+"]\n";
	}
	
	public double getTempMin() {
		return this.tempMin;
	}
	
	public double getTempMax() {
		return this.tempMax;
	}
}