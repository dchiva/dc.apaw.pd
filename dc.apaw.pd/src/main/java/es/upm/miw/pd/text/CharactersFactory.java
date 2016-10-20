package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class CharactersFactory {
	
	private static CharactersFactory charactersFactory;
	private Map<Character,EditorCharacter> characters;
	
	private CharactersFactory(){
		this.characters=new HashMap<Character, EditorCharacter>();
	}

	public static CharactersFactory getCharactersFactory(){
		if(charactersFactory==null){
			charactersFactory=new CharactersFactory();
		}
		return charactersFactory;
	}
	
	public EditorCharacter getCharacter(Character character){
		if(!this.characters.containsKey(character)){
			this.characters.put(character,new EditorCharacter(character));
		}
		return this.characters.get(character);
	}
	
}
