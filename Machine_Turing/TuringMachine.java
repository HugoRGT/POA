package Machine_Turing;

public class TuringMachine {
	private Tape ruban;
	private int state;
	
	public TuringMachine() {
		this.state = 1;
		this.ruban = new Tape();
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
		for(i = 0; i < seqLength && this.ruban.goRight(); i++) {
			char sequenceChar = sequence.charAt(i);
			switch(sequenceChar) {
			case '0' :{execute('e');}break;
			case '1' :{execute('w');}break;
			default :{break;}
			}
			execute('r');
		}
		for(int j = i; this.ruban.goLeft(); ++i) {
			execute('l');
		}
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
	
	public String toString() {
		return this.ruban.toString();
	}
	
	public void displaytape() {
		System.out.println(toString());
	}
}
