package es.upm.miw.pd.text;

public class EditorCharacter extends Editor{

	private Character character;
	
	public EditorCharacter(Character character){
		this.character=character;
	}
	
	@Override
	public void remove(Editor editor) {
		
	}

	@Override
	public void add(Editor editor) {
		
	}

	@Override
	public boolean isCharacter() {
		return true;
	}

	@Override
	public String draw(boolean forceUpperCase) {
		String result="";
		if(forceUpperCase){
			result+=Character.toUpperCase(this.character.charValue());
		}else{
			result+=this.character;
		}
		return result;
	}

}
