package es.upm.miw.pd.visitor.figure;

public class Square implements Figure{

    private int side;
    
    @Override
    public void accept(Functions functions) {
        functions.visitElementSquare(this);
    }

}
