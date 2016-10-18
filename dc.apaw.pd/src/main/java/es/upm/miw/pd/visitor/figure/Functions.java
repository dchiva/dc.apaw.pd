package es.upm.miw.pd.visitor.figure;

public abstract class Functions {

    private double counter=0;
    
    public abstract void visitElementCircle( Circle circle);
    public abstract void visitElementSquare( Square square);
    public abstract void visitElementTriangle( Triangle triangle);
    
    public void incrementCounter(int increment){
        this.counter+=increment;
    }
    
    public void incrementCounter(double increment){
        this.counter+=increment;
    }
    
    public double getCounter(){
        return this.counter;
    }
}
