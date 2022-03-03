package Machine_Turing;

public class Program {
	private Instruction[]code;
	private int size;
	private String name;
	
	public Program(String name,int capacity) {
		this.name = name;
		this.size = 0;
		this.code = new Instruction[capacity];
	}
	
	public Instruction getInstruction(int current,boolean symbol) {
		Instruction instr = this.code[0];
		for(int i = 0; i < this.size; i++) {
			if(this.code[i].getCurrent() == current && this.code[i].getSymbol() == symbol) {
				instr = this.code[i];
			}
		}
		return instr;
	}
	
	public void add(Instruction prog) {
		this.code[size] = prog;
		this.size++;
	}
	public void add(int current,int futur,boolean symbol,String action) {
		Instruction newInstruc = new Instruction(current,futur,action,symbol);
		add(newInstruc);
	}
	
	public String toString() {
		String res = "Program "+this.name.toUpperCase()+"\n";
		for(int i = 0; i < this.size; i++) {
			//switch
			res += ""+i+" : "+this.code[i].toString()+"\n";
		}
		return res;
	}
}