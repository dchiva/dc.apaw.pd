package es.upm.miw.pd.text;

import java.util.ArrayList;
import java.util.List;

public abstract class EditorComponent extends Editor{

	private List<Editor> editorComponents;
	
	public EditorComponent(){
		this.editorComponents=new ArrayList<Editor>();
	}
	
	public void addEditorComponent(Editor editor){
		this.editorComponents.add(editor);
	}
	
	@Override
	public String draw(boolean forceUpperCase) {
		String result="";
		for(Editor component: this.editorComponents){
			result+=component.draw(forceUpperCase);
		}
		result+=this.getFooter();
		return result;
	}
	
	@Override
	public boolean isCharacter() {
		return false;
	}
	
	@Override
	public void remove(Editor editor) {
		int elementPosition=this.editorComponents.indexOf(editor);
		if(elementPosition>0){
			this.editorComponents.remove(elementPosition);
		}
	}
	
	abstract String getFooter();
}
