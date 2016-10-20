package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class RestoreCommand extends CalculatorActionsWithMemento{

	public RestoreCommand(){}
	
	public RestoreCommand(MementableCalculator calculator) {
		this.setCalculadora(calculator);
	}

	@Override
	public void execute() {
		MementoManager mementoManager=CalculatorMementoManager.getMementoManager();
		String message="Selecciona el punto de restauración";
		String restorePoint=(String)IO.getIO().select(mementoManager.getMementosKeys().toArray(), message);
		CalculatorMemento memento=(CalculatorMemento) mementoManager.getMemento(restorePoint);
		this.getCalculadora().restoreMemento(memento);
	}

	@Override
	public String name() {
		return "Restore";
	}

}
