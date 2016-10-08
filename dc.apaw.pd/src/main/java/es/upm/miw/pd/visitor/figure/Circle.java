package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure{

    private int radio;
    
    @Override
    public void accept(Functions functions) {
        functions.visitElementCircle(this);
    }

}
