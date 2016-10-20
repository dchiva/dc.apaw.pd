package es.upm.miw.pd.command.calculator.memento;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public abstract class MementoManager<T,MEMENTO> {

	static MementoManager mementoManager;
	private Map<T,MEMENTO> mementos;
	
	MementoManager(){
		this.mementos=new HashMap<T,MEMENTO>();
	}
	
	public static MementoManager getMementoManager;
	
	public MEMENTO getMemento(T key){
		if(this.mementos.containsKey(key)){
			return this.mementos.get(key);
		}
		return null;
	}
	
	public void addMemento(T key,MEMENTO memento){
		this.mementos.put(key, memento);
	}
	
	public Map<T,MEMENTO> getMementos(){
		return this.mementos;
	}
	
	public Set<T> getMementosKeys(){
		return this.getMementos().keySet();
	}
}
