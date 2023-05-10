package miHangar;

public class Tie extends Nave {
	private float cilindrada;

	
	public Tie() {
		super();
		this.cilindrada = 0.0f;
	}
	
	public Tie(String matricula, String flota, float cilindrada) {
		super(matricula, flota);
		this.cilindrada = cilindrada;
	}
	
	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String toString() {
		return "Tie Fighter de la flota: " + flota.getFlota() +  "con matricula: " + matricula + " y cilindrada de " + cilindrada + ".";
	}
}
