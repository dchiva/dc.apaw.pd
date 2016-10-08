package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends AccionesCalculadora{

    public AddCommand(Calculator calculator) {
        this.setCalculadora(calculator);
    }

    @Override
    public void execute() {
        int number = (Integer) IO.getIO().readInt("Introduce un número entero a sumar");
        this.getCalculadora().add(number);
    }

    @Override
    public String name() {
        return "Add";
    }

}
