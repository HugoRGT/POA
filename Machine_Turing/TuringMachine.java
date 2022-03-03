package Machine_Turing;

public class TuringMachine {
	private Tape ruban;
	private int state;
	
	public TuringMachine(int size) {
		this.state = 1;
		this.ruban = new Tape(size);
	}
	
	public int getState() {
		return this.state;
	}
	
	public void teteLecture() {
		while(ruban.goLeft()) {
			ruban.goLeft();
		}
	}
	
	public void movingLeft(int cases) {
		for(int i = 0; i < cases && this.ruban.goLeft(); i++) {
			execute('l');
		}
	}
	
	public void movingRight(int cases) {
		for(int i = 0; i < cases && this.ruban.goRight(); i++) {
			execute('r');
		}
	}
	
	public void writingSequence(String sequence) {
		int seqLength = sequence.length();
		int i;
		for(i = 0; i < seqLength && i < this.ruban.getSizeTape(); i++) {
			char sequenceChar = sequence.charAt(i);
			char action = (sequenceChar == '0')?'e' : 'w';
			execute(action);
			execute('r');
		}
		teteLecture();
	}
	public void changeState(int newState){
		this.state = newState;
	}
	
	public boolean execute(char action) {
		switch(action) {
			case 'r' :{this.ruban.goRight();}break;
			case 'l' :{this.ruban.goLeft();}break;
			case 'w' :{this.ruban.write();}break;
			case 'e' :{this.ruban.erase();}break;
			default :{return false;}
		}
		return true;
	}
	
	public void process(Program prog) {
		do {
			Instruction instr = prog.getInstruction(this.state, this.ruban.read());
			System.out.print("Given Instructions -> ");
			System.out.println(instr.toString());
			if(instr.getAction().length() > 1) {
				execute(instr.getAction().charAt(0));
				execute(instr.getAction().charAt(1));
			}else {
				execute(instr.getAction().charAt(0));
			}
			changeState(instr.getFutur());
			System.out.print("Current Tape -> ");
			displaytape();
			System.out.println();
			System.out.println();
		}while(this.state != 0);
	}
	
	public String toString() {
		return this.ruban.toString();
	}
	
	public void displaytape() {
		System.out.println(toString());
	}
}