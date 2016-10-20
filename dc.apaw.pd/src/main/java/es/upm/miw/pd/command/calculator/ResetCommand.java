package es.upm.miw.pd.command.calculator;

public class ResetCommand extends AccionesCalculadora {

    public ResetCommand(Calculator calculator) {
        this.setCalculadora(calculator);
    }

    @Override
    public void execute() {
        this.getCalculadora().reset();
    }

    @Override
    public String name() {
        return "Reset";
    }

}
