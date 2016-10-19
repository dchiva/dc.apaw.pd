package es.upm.miw.pd.command.calculator.memento;

public interface CalculatorMementable {

	MementoCalculator createMemento();
	
	void restoreMemento(MementoCalculator mementoCalculator);
}
