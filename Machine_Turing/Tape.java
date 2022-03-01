package Machine_Turing;

public class Tape {
	private boolean []tab;
	private int index;
	
	public Tape(int size) {
		this.index = 0;
		this.tab = new boolean[size];
	}
	public Tape() {
		this(1000);
	}
	
	public boolean goRight() {
		if(this.tab.length == index+1) {
			return false;
		}
		this.index++;
		return true;
	}
	
	public boolean goLeft() {
		if(this.index == 0) {
			return false;
		}
		this.index--;
		return true;
	}
	
	public void write() {
		this.tab[this.index] = true;
	}
	
	public void erase() {
		this.tab[this.index] = false;
	}
	
	public boolean read() {
		return this.tab[this.index];
	}
	
	public String toString() {
		String ch = "";
		for(int i = 0; i < this.tab.length; i++) {
			if(i == this.index) {
				ch += (this.tab[i]==true)?"[1]" : "[_]";
				continue;
			}
			ch += (this.tab[i]==true)?"1" : "_";
		}
		return ch;
	}
}
