package es.upm.miw.pd.command.calculator.memento;

import upm.jbb.IO;

public class SaveCommand extends CalculatorActionsWithMemento{

	public SaveCommand(){}
	
	public SaveCommand(MementableCalculator calculator) {
		this.setCalculadora(calculator);
	}

	@Override
	public void execute() {
		String restorePointKey=IO.getIO().readString("Introduce el nombre del punto de restauracion: ");
		CalculatorMementoManager.getMementoManager().addMemento(restorePointKey, this.getCalculadora().createMemento());
	}

	@Override
	public String name() {
		return "Save";
	}

}
