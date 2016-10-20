package es.upm.miw.pd.text;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TextTest {

	private Editor H, o, l, a, pf, txt;

    @Before
    public void ini() {
        H = CharactersFactory.getCharactersFactory().getCharacter('H');
        o = CharactersFactory.getCharactersFactory().getCharacter('o');
        l = CharactersFactory.getCharactersFactory().getCharacter('l');
        a = CharactersFactory.getCharactersFactory().getCharacter('a');
        pf = new Paragraph();
        pf.add(H);
        pf.add(o);
        pf.add(l);
        pf.add(a);
        txt = new Text();
        txt.add(pf);
        txt.add(pf);
    }

    @Test
    public void testCaracterFlyweight() {
        assertSame(H, CharactersFactory.getCharactersFactory().getCharacter('H'));
    }

    @Test
    public void testCaracterAddCaracter() {
        H.add(o);
    }

    @Test
    public void testDibujarCaracterNormal() {
        assertEquals("o", o.draw(false));
    }

    @Test
    public void testDibujarCaracterMayusculas() {
        assertEquals("O", o.draw(true));
    }

    // ----------------------------------------------

    @Test
    public void testParrafoNormal() {
        assertEquals("Hola\n", pf.draw(false));
    }

    @Test
    public void testParrafoMayusculas() {
        assertEquals("HOLA\n", pf.draw(true));
    }

    @Test
    public void testParrafoNoAddParrafo() {
        try {
            pf.add(pf);
            fail("");
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

    // ----------------------------------------------

    @Test
    public void testTextoNormal() {
        assertEquals("Hola\nHola\n---o---\n",txt.draw(false));
    }
    
    @Test
    public void testTextoMayusculas() {
        assertEquals("HOLA\nHOLA\n---o---\n",txt.draw(true));
    }
    
    @Test
    public void testTextoNoAddCaracter() {
        try {
            txt.add(H);
            fail();
        } catch (UnsupportedOperationException ignored) {
            ignored.toString();
        }
    }

}
