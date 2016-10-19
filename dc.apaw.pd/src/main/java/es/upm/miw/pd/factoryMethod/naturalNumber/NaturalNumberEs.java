package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber{


	private static final String[] spanishNumbers={"cero", "uno", "dos", "tres", "cuatro", "cinco"};
	
	public NaturalNumberEs() {
		super(0,spanishNumbers);
	}
	
    public NaturalNumberEs(int value) {
        super(value,spanishNumbers);
    }
    
}
