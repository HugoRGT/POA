package Machine_Turing;

public class StartingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TuringMachine machine = new TuringMachine(14);
		System.out.print("Current Tape -> ");
		machine.displaytape();
		System.out.println("Writing sequence : \"0110111\"");
		machine.writingSequence("00111011111000");
		System.out.print("Current Tape -> ");
		machine.displaytape();
		
		Program prog = new Program("Addition",6);
		prog.add(1, 1, false, "r");
		prog.add(1, 2, true, "r");
		prog.add(2, 2, true, "r");
		prog.add(2, 3, false, "wr");
		prog.add(3, 3, true, "r");
		prog.add(3, 0, false, "le");
		System.out.println(prog.toString());
		
		machine.process(prog);
		
		
	}
}