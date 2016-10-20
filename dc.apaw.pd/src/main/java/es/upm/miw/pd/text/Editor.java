package es.upm.miw.pd.text;

public abstract class Editor {

	Editor(){}
	
	public abstract void remove(Editor editor);
	
	public abstract void add(Editor editor);
	
	public abstract boolean isCharacter();
	
	public abstract String draw(boolean forceUpperCase);
}
