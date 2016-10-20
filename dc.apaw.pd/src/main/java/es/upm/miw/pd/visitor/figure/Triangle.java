package es.upm.miw.pd.visitor.figure;

public class Triangle implements Figure{

    private int base;
    private int height;
    
    public Triangle(int base, int height){
    	this.base=base;
    	this.height=height;
    }
    @Override
    public void accept(Functions functions) {
        functions.visitElementTriangle(this);
    }

    public int getBase(){
    	return this.base;
    }
    
    public int getHeight(){
    	return this.height;
    }
}
