package tpfxml;

import java.util.Vector;

public class CalcModel {
	
	long nb=0;
	boolean typingDigit=false;
	enum Operator {Addition, Substraction, Multiplication, Division};
	Vector<Operator> operations = new Vector<Operator>();
	Vector<Long> operands = new Vector<Long>();

	void addDigitRight(long d){
		typingDigit=true;
		nb=nb*10+d;
	}
	
	void addOperator(String op) {
		if (typingDigit) {
			operands.add(new Long(nb));
			nb=0;
			switch (op.charAt(0)) {
				case '+':operations.add(Operator.Addition);break;
				case '-':operations.add(Operator.Substraction);break;
				case '*':operations.add(Operator.Multiplication);break;
				case '/':operations.add(Operator.Division);break;
			}	
		}
		typingDigit=false;
	}
	
	void calculate() {
		if (typingDigit) {
			operands.add(new Long(nb));
		}
		if (operands.size()>0) {
			long res = (Long)operands.get(0).longValue();
			for (int i=1;i<operands.size();i++) {
				switch ((Operator)operations.get(i-1)) {
					case Addition:res = res + operands.get(i).longValue(); break;
					case Substraction:res = res - operands.get(i).longValue(); break;
					case Multiplication:res = res * operands.get(i).longValue(); break;
					case Division:res = res / operands.get(i).longValue(); break;
				}
			}
			nb=res;
			operations.clear();
			operands.clear();
		}
	}
	
	void clear() {
		nb=0;
		typingDigit=false;
		operations.clear();
		operands.clear();
	}
}
