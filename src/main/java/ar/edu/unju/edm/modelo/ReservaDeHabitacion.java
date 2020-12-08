package ar.edu.unju.edm.modelo;

public class ReservaDeHabitacion {
	
	private long idReserva;
	private String tipo;
	private String desayuno;
	
	public ReservaDeHabitacion() {
		
	}

	public ReservaDeHabitacion(long idReserva, String tipo, String desayuno) {
		super();
		this.idReserva = idReserva;
		this.tipo = tipo;
		this.desayuno = desayuno;
	}

	public long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(long idReserva) {
		this.idReserva = idReserva;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}
	
}