package es.upm.miw.pd.composite.expression.solution;

import java.util.List;

public abstract class Operacion extends Expresion{

        private char signoOperacion;
        
        private Expresion expresion1;
        
        private Expresion expresion2;

        public String toString(){
            return '('+this.expresion1.toString()+signoOperacion+this.expresion2.toString()+')';
        }
        
        public char getSignoOperacion() {
            return signoOperacion;
        }

        public void setSignoOperacion(char signoOperacion) {
            this.signoOperacion = signoOperacion;
        }

        public Expresion getExpresion1() {
            return expresion1;
        }

        public void setExpresion1(Expresion expresion1) {
            this.expresion1 = expresion1;
        }

        public Expresion getExpresion2() {
            return expresion2;
        }

        public void setExpresion2(Expresion expresion2) {
            this.expresion2 = expresion2;
        }
        
        
}
