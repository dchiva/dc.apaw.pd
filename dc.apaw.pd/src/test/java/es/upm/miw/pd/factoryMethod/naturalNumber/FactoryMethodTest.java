package es.upm.miw.pd.factoryMethod.naturalNumber;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void defaultConstructors() {
		List<Creator> creators=new ArrayList<Creator>();
		creators.add(new CreatorNaturalNumberEs());
		creators.add(new CreatorNaturalNumberEn());
		assertEquals("cero", creators.get(0).createNaturalNumber().getTextValue());
		assertEquals("zero", creators.get(1).createNaturalNumber().getTextValue());
	}
	
	@Test
	public void constructorsWithValues() {
		List<Creator> creators=new ArrayList<Creator>();
		creators.add(new CreatorNaturalNumberEs());
		creators.add(new CreatorNaturalNumberEn());
		assertEquals("dos", creators.get(0).createNaturalNumber(2).getTextValue());
		assertEquals("two", creators.get(1).createNaturalNumber(2).getTextValue());
	}

}
