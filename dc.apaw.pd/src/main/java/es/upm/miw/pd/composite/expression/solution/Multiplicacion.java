package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends Operacion{

    public Multiplicacion(Expresion expresion1, Expresion expresion2){
        this.setExpresion1(expresion1);
        this.setExpresion2(expresion2);
        this.setSignoOperacion('*');
    }

    @Override
    public int operar() {
        return this.getExpresion1().operar()*this.getExpresion2().operar();
    }
    
}
