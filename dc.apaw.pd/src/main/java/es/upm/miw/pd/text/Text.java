package es.upm.miw.pd.text;

public class Text extends EditorComponent{

	@Override
	public void remove(Editor editor) {
		this.removeEditorComponent(editor);
	}

	@Override
	public void add(Editor editor) {
		this.addEditorComponent(editor);
	}

	@Override
	public boolean isCharacter() {
		return false;
	}

	@Override
	String getFooter() {
		return "/n---o---/n";
	}

}
