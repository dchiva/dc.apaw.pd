package es.upm.miw.pd.visitor.figure;

public class Area extends Functions{

    @Override
    public void visitElementCircle(Circle circle) {
       this.incrementCounter(Math.PI*circle.getRadio()*circle.getRadio());
    }

    @Override
    public void visitElementSquare(Square square) {
        this.incrementCounter(square.getSide()*square.getSide());
    }

    @Override
    public void visitElementTriangle(Triangle triangle) {
        this.incrementCounter(triangle.getBase()*triangle.getHeight()/2);
    }

}
