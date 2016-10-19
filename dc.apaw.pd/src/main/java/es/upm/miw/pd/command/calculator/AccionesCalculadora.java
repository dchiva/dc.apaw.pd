package es.upm.miw.pd.command.calculator;

public abstract class AccionesCalculadora implements Comando{
    
    private Calculator calculadora;
    
    public Calculator getCalculadora(){
        return calculadora;
    }
    
    public void setCalculadora(Calculator calculadora){
    	if(this.calculadora==null){
            this.calculadora=calculadora;
    	}
    }

}
