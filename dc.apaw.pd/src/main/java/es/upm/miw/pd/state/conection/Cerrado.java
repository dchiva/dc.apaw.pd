package es.upm.miw.pd.state.conection;

public class Cerrado extends State{

	@Override
	public void abrir() {
			Conexion.setState(new Preparado());
	}

	@Override
	public void cerrar() {
		
	}

	@Override
	public void parar() {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void iniciar() {
		throw new UnsupportedOperationException();	
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
		return Estado.CERRADO;
	}

}
