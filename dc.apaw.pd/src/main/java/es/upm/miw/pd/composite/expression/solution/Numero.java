package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
    
    private int numero;
    
    public Numero(int numero){
        this.numero=numero;
    }

    @Override
    public void add(Expresion expresion) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Expresion expresion) {
        // TODO Auto-generated method stub
 
    }

    @Override
    public int operar() {
        // TODO Auto-generated method stub
        return this.numero;
    }
    
    public String toString(){
        return String.valueOf(this.numero);
    }
}
