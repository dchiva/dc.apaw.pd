package es.upm.miw.pd.state.conection;

public class Preparado extends State{

	@Override
	public void abrir() {
		
	}

	@Override
	public void cerrar() {
		Conexion.setState(new Cerrado());
	}

	@Override
	public void parar() {
		Conexion.setState(new Parado());
	}

	@Override
	public void iniciar() {
		
	}

	@Override
	public void enviar(String msg) {
		
		Conexion.setState(new Esperando());
		Conexion.getLink().enviar(msg);
		
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Estado getEstado() {
		return Estado.PREPARADO;
	}

}
