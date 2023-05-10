package miHangar;

public class Wing extends Nave {
	private int motores;

	public Wing() {
		super();
		motores = 1;
	}
	
	public Wing(String matricula, boolean imperio, int motores) {
		super(matricula, imperio);
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
		return "Wing Fighter de la flota " + ((imperio)? "imperial ": "de la república ") +  "con matricula: " + matricula + " y " + motores + " motores.";
	}
}
