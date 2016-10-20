package es.upm.miw.pd.command.calculator.memento;

import java.util.HashMap;
import java.util.Map;

public class CalculatorMementoManager extends MementoManager<String,CalculatorMemento>{
	
	public static MementoManager<String, CalculatorMemento> getMementoManager(){
		if(mementoManager==null){
			mementoManager=new CalculatorMementoManager();
		}
		return mementoManager;
	}
	
	/*public CalculatorMemento getMemento(String key){
		if(this.getMementos().containsKey(key)){
			return this.getMementos().get(key);
		}
		return null;
	}
	
	public void addMemento(String key,CalculatorMemento memento){
		this.getMementos().put(key, memento);
	}*/

}
