package es.upm.miw.pd.visitor.figure;

public class Circle implements Figure{

    private int radio;
    
    public Circle(int radio){
    	this.radio=radio;
    }
    @Override
    public void accept(Functions functions) {
        functions.visitElementCircle(this);
    }
    
    public int getRadio(){
    	return this.radio;
    }

}
