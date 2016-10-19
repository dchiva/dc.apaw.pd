package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber{

	private static final String[] englishNumbers={"cero", "uno", "dos", "tres", "cuatro", "cinco"};


	public NaturalNumberEn() {
		super(0,englishNumbers);
	}
	
    public NaturalNumberEn(int value) {
        super(value,englishNumbers);
    }
    
}
