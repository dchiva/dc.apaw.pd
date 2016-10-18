package es.upm.miw.pd.visitor.figure;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class VisitorFigureTest {

    public static List<Figure> figures;
    @Before
    public void getDatos(){
        figures=new ArrayList<Figure>();
        figures.add(new Circle(5));
        figures.add(new Triangle(2,3));
        figures.add(new Square(4));
    }
    @Test
    public void testArea() {
        Functions area=new Area();
        for(Figure figure:figures){
        	figure.accept(area);
        }
        assertEquals(97.5,area.getCounter(),10e-1);
    }
    
    @Test
    public void testNumberOfSides() {
    	 Functions numberOfSides=new NumberOfSides();
         for(Figure figure:figures){
         	figure.accept(numberOfSides);
         }
         assertEquals(7,numberOfSides.getCounter(),10e-5);
    }

}
