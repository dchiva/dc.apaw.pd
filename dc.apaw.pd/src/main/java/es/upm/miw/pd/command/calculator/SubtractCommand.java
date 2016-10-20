package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends AccionesCalculadora {

    public SubtractCommand(Calculator calculator) {
        this.setCalculadora(calculator);
    }

    @Override
    public void execute() {
        int number=IO.getIO().readInt("Introduce un número para restarlo");
        this.getCalculadora().subtract(number);
    }

    @Override
    public String name() {
        return "Substract";
    }

}
