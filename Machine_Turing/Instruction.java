package Machine_Turing;

public class Instruction {
	private int current;
	private int futur;
	private boolean symbol;
	private String action;
	
	public Instruction(int init,int finalI,String act,boolean sym) {
		this.current = init;
		this.futur = finalI;
		this.action = act;
		this.symbol = sym;
	}

	public int getCurrent() {
		return this.current;
	}

	public int getFutur() {
		return this.futur;
	}

	public boolean getSymbol() {
		return this.symbol;
	}

	public String getAction() {
		return this.action;
	}
	
	public String toString() {
		return "<"+this.current+","+this.symbol+","+this.action+","+this.futur+">";
	}
}