package es.upm.miw.pd.command.calculator.memento;

public abstract class CalculatorActionsWithMemento implements Comando{

	private MementableCalculator calculator;
    
    public MementableCalculator getCalculadora(){
        return calculator;
    }
    
    public void setCalculadora(MementableCalculator calculator){
    	if(this.calculator==null){
            this.calculator=calculator;
    	}
    }
}
