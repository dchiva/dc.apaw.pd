package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion{
    
    private int numero;
    
    public Numero(int numero){
        this.numero=numero;
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
