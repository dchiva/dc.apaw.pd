package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure{

    private int sideA;
    private int sideB;
    private int sideC;
    
    @Override
    public void accept(Functions functions) {
        functions.visitElementTriangle(this);
    }

}
