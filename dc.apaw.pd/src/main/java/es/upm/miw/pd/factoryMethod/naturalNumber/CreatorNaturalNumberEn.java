package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreatorNaturalNumberEn extends Creator{

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEn();
	}

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEn(number);
	}

}
