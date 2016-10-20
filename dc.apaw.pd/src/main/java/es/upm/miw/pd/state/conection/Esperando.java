package es.upm.miw.pd.state.conection;

public class Esperando extends State{

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
		if (respuesta == 0) {
			Conexion.setState(new Preparado());
		} else {
			Conexion.setState(new Cerrado());
		}
	}

	@Override
	public Estado getEstado() {
		return Estado.ESPERANDO;
	}

}
