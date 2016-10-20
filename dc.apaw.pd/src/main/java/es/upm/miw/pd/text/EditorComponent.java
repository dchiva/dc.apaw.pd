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
	
	public void removeEditorComponent(Editor editor){
		int elementPosition=this.editorComponents.indexOf(editor);
		if(elementPosition>0){
			this.editorComponents.remove(elementPosition);
		}
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
	abstract String getFooter();
}
