package es.upm.miw.pd.command.calculator.memento;

public class CalculatorMemento {
	
	private int calculatorValue;
	
	public CalculatorMemento(int calculatorValue){
		this.setMemento(calculatorValue);
	}
	
	public int getMemento(){
		return this.calculatorValue;
	}
	
	public void setMemento(int calculatorValue){
		this.calculatorValue=calculatorValue;
	}
}
