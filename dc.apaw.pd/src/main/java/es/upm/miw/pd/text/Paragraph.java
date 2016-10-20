package es.upm.miw.pd.text;

public class Paragraph extends EditorComponent{

	@Override
	public void add(Editor editor) throws UnsupportedOperationException{
		if(editor.isCharacter()){
			this.addEditorComponent(editor);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	String getFooter() {
		return "\n";
	}

}
