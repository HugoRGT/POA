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
	
	public Instruction getInstruction(int current,int futur,boolean symbol,String action) {
		Instruction newInstruc = new Instruction(current,futur,action,symbol);
		add(newInstruc);
		return newInstruc;
	}
	
	public void add(Instruction prog) {
		this.code[size] = prog;
		this.size++;
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
