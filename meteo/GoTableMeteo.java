package meteo;

public class GoTableMeteo {

	public static void main(String[]args){
		TableMeteo table = new TableMeteo();

		Station stB = new Station("Besançon",25000);
		Date[]dates = new Date[3];
		dates[0] = new Date(1,5,2022);
		dates[1] = new Date(2,5,2022);
		dates[2] = new Date(3,5,2022);
		Releve[]tReleves = new Releve[3];
		tReleves[0] = new Releve(dates[0],0.5,4);
		tReleves[1] = new Releve(dates[1],-18,0);
		tReleves[2] = new Releve(dates[2],-1,3);
		for(int i = 0; i < 3; i++){
			table.ajouter(stB,tReleves[i]);	
		}
		Station stP = new Station("Pontarlier",25300);
		tReleves[0] = new Releve(dates[0],-2.5,4);
		tReleves[1] = new Releve(dates[1],-5,-1);
		tReleves[2] = new Releve(dates[2],-6,0);
		for(int i = 0; i < 3; i++){
			table.ajouter(stP,tReleves[i]);
		}

		table.afficher(stB);
		table.afficher(stP);
		System.out.println(table.temperatureMinStation(stP));
		System.out.println(table.temperatureMin());
	}
}
