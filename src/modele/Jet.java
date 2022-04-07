package modele;

import modele.De;

public class Jet {
	private De  jt []; 	//les trois dés
	int nbRouler; 		//nombre de lancers
	
	public  Jet() {
		jt=new De  [3];
		for (int i=0;i<3;i++)
			jt[i]=new De();
		nbRouler=0;
	}
	
	public void roulerTroisDes() {
		for (int i=0;i<3;i++) 
			jt[i].rouler();
	}
	
	public void initNbRouler() {
		nbRouler=0;
	}
	
	public void roulerDe(int i) {
			jt[i].rouler();
	}
	
	public int getValeur(int i) {
			return jt[i].getValeur();
	}
	
	public void incrNbRouler() {
		nbRouler+=1;
	}
	
	public int getNbRouler () {
		return nbRouler;
	}
	
	public int getGain() {
		int g=0;
		// tri
		int temp;
		int d1=jt[0].getValeur();
		int d2=jt[1].getValeur();
		int d3=jt[2].getValeur();
		if (d1 > d2) {
			temp=d2;
			d2=d1;
			d1=temp;
		}
		if (d1 > d3) {
			temp=d3;
			d3=d1;
			d1=temp;
		}
		if (d2 > d3) {
			temp=d3;
			d3=d2;
			d2=temp;
		}
		
		if ((d1==1) && (d2==2) && (d3==4) )
			g=30;
		else
			if (d1==d3)
				g=d1*3;
			else
				if  ((d1==d2) || (d2==d3))
					g=d2*2;
		return g;
	}
}