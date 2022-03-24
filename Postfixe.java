package tp5;
import java.util.Deque;
import java.util.LinkedList;

public class Postfixe {
	private String expr = "";
	private Deque<Integer>pile;
	private int[]values;
	
	public Postfixe(String expression) {
		this.expr = expression;
		this.pile = new LinkedList<Integer>();
	}
	
	public void createStack() {
		int number = (int)this.expr.charAt(0);
		this.pile.addFirst(number-48);
		for(int i = 1; i < this.expr.length(); i++) {
			number = this.expr.charAt(i);
			if(number-48 > 0 && number-48<10) {
				number = number-48;
			}
			this.pile.addLast(number);
		}
	}
	
	public int calc(int number1,int number2,char operateur) {
		int n = 0;
		switch(operateur) {
		case '+': n = number1 + number2;return n;break;
		case '-': n = number1-number2;return n;break;
		case '*': n = number1*number2;return n;break;
		case '/': n = number1/number2;return n;break;
		}
		return n;
	}
	
	public int evaluateExpr(int values[]) {
		Deque<Integer>temp = new LinkedList<Integer>();
		while(this.pile.peekFirst()!= null) {
			if(this.pile.peekFirst() > 9) {
				char c = (char)this.pile.pollFirst();
				int num2 = temp.pollLast();
				int num1 = temp.pollLast();
				int res = calc(num1,num1,c);
			}
			temp.addLast(this.pile.pollFirst());
		}
		return temp.pollFirst;
	}
	
	public String transformExpr() {
		int[]calc = new int[this.expr.length()];
		
		return "";
	}
}
