package es.upm.miw.pd.visitor.figure;

public class Square implements Figure{

    private int side;
    
    public Square(int side){
    	this.side=side;
    }
    
    @Override
    public void accept(Functions functions) {
        functions.visitElementSquare(this);
    }
    
    public int getSide(){
    	return this.side;
    }

}
