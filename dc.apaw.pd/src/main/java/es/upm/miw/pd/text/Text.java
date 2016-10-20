package es.upm.miw.pd.text;

public class Text extends EditorComponent{

	@Override
	public void remove(Editor editor) {
		this.removeEditorComponent(editor);
	}

	@Override
	public void add(Editor editor) throws UnsupportedOperationException{
		if(editor.isCharacter()){
			throw new UnsupportedOperationException();
		}
		this.addEditorComponent(editor);
	}

	@Override
	public boolean isCharacter() {
		return false;
	}

	@Override
	String getFooter() {
		return "---o---\n";
	}

}
