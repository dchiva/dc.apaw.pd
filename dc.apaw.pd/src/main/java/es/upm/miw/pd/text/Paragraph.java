package es.upm.miw.pd.text;

public class Paragraph extends EditorComponent{

	@Override
	public void remove(Editor editor) {
		this.removeEditorComponent(editor);
	}

	@Override
	public void add(Editor editor) throws UnsupportedOperationException{
		if(editor.isCharacter()){
			this.addEditorComponent(editor);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public boolean isCharacter() {
		return false;
	}

	@Override
	String getFooter() {
		return "\n";
	}

}
