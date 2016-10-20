package es.upm.miw.pd.state.conection;

public class Conexion {
	
	private static State state;
	private static Link link;

	public Conexion(Link inputlink) {
		assert inputlink != null;
		link = inputlink;
		state=new Cerrado();
	}

	public static Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return state.getEstado();
	}

	public State getState(){
		return state;
	}
	
	public static void setState(State estado){
		state=estado;
	}
	
	public void abrir() {
		this.getState().abrir();
	}

	public void cerrar() {
		this.getState().cerrar();
	}

	public void parar() {
		this.getState().parar();
	}

	public void iniciar() {
		this.getState().iniciar();
	}

	public void enviar(String msg) {
		this.getState().enviar(msg);
	}

	public void recibir(int respuesta) {
		this.getState().recibir(respuesta);
	}

}
