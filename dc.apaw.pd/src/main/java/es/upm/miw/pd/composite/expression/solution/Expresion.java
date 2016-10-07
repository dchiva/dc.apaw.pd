package es.upm.miw.pd.composite.expression.solution;

public abstract class Expresion {

    public abstract void add(Expresion expresion);
    
    public abstract void remove(Expresion expresion);
    
    public abstract int operar();
    
}
