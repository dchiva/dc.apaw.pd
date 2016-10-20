package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends AccionesCalculadora {

    public PrintCommand(Calculator calculator) {
        this.setCalculadora(calculator);
    }

    @Override
    public void execute() {
    	IO.getIO().clear();
        IO.getIO().print(this.getCalculadora().getTotal());
    }

    @Override
    public String name() {
        return "Print";
    }

}
