package es.upm.miw.pd.command.calculator.memento;

public class CalculatorMementoManager extends MementoManager<String,CalculatorMemento>{
	
	public static MementoManager<String, CalculatorMemento> getMementoManager(){
		if(mementoManager==null){
			mementoManager=new CalculatorMementoManager();
		}
		return mementoManager;
	}

}
