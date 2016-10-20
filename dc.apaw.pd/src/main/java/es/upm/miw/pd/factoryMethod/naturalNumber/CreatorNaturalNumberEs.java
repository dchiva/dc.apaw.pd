package es.upm.miw.pd.factoryMethod.naturalNumber;

public class CreatorNaturalNumberEs extends Creator{

	@Override
	public NaturalNumber createNaturalNumber() {
		return new NaturalNumberEs();
	}

	@Override
	public NaturalNumber createNaturalNumber(int number) {
		return new NaturalNumberEs(number);
	}

}
