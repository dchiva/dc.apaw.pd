package es.upm.miw.pd.state.conection;

public class Parado extends State{

	@Override
	public void abrir() {
		throw new UnsupportedOperationException();	
	}

	@Override
	public void cerrar() {
		throw new UnsupportedOperationException();	
	}

	@Override
	public void parar() {
		
	}

	@Override
	public void iniciar() {
		Conexion.setState(new Preparado());
	}

	@Override
	public void enviar(String msg) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public void recibir(int respuesta) {
		throw new UnsupportedOperationException();	
	}

	@Override
	public Estado getEstado() {
		return Estado.PARADO;
	}

}
