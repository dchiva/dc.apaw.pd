package es.upm.miw.pd.state.conection;

public abstract class State {

	public abstract void abrir() throws UnsupportedOperationException;

	public abstract void cerrar() throws UnsupportedOperationException;

	public abstract void parar() throws UnsupportedOperationException;

	public abstract void iniciar() throws UnsupportedOperationException;

	public abstract void enviar(String msg) throws UnsupportedOperationException;

	public abstract void recibir(int respuesta) throws UnsupportedOperationException;
	
	public abstract Estado getEstado();

}
