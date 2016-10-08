package es.upm.miw.pd.visitor.figure;

public class NumberOfSides extends Functions{

    @Override
    public void visitElementCircle(Circle circle) {
        this.incrementCounter(0);    
    }

    @Override
    public void visitElementSquare(Square square) {
        this.incrementCounter(4); 
    }

    @Override
    public void visitElementTriangle(Triangle triangle) {
        this.incrementCounter(3); 
    }

}
