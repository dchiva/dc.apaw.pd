package es.upm.miw.pd.command.calculator.memento;

public class MementableCalculator implements Mementable<CalculatorMemento>{

	Calculator calculator;
	
	public MementableCalculator(Calculator calculator){
		this.calculator=calculator;
	}
	
	private Calculator getCalculator(){
		return this.calculator;
	}
	@Override
	public CalculatorMemento createMemento() {
		return new CalculatorMemento(this.getCalculator().getTotal());
	}

	@Override
	public void restoreMemento(CalculatorMemento memento) {
		this.getCalculator().setTotal(memento.getMemento());
	}

}
