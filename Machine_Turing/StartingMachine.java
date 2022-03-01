package Machine_Turing;

public class StartingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TuringMachine machine = new TuringMachine();
		machine.displaytape();
		machine.writingSequence("10110011100011110000111100101111110000001111111111");
		machine.displaytape();
		machine.movingRight(5);
		machine.displaytape();
		
		Program prog = new Program("Addition",6);
		prog.getInstruction(1, 1, false, "r");
		System.out.println(prog.toString());
		prog.getInstruction(1, 2, false, "r");
		System.out.println(prog.toString());
		prog.getInstruction(2, 2, false, "r");
		System.out.println(prog.toString());
		prog.getInstruction(2, 3, false, "wr");
		System.out.println(prog.toString());
		prog.getInstruction(3, 3, false, "r");
		System.out.println(prog.toString());
		prog.getInstruction(3, 0, false, "le");
		System.out.println(prog.toString());
	}
}