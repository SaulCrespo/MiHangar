package miHangar;

public class Wing extends Nave {
	private int motores;

	public Wing() {
		super();
		motores = 1;
	}
	
	public Wing(String matricula, String flota, int motores) {
		super(matricula, flota);
		this.motores = motores;
	}
	
	public int getMotores() {
		return motores;
	}

	public void setMotores(int motores) {
		this.motores = motores;
	}
	
	@Override
	public String toString() {
		return "Wing Fighter de la flota: " + flota.getFlota() +  "con matricula: " + matricula + " y " + motores + " motores.";
	}
}
