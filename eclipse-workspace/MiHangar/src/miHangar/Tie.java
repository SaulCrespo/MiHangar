package miHangar;

public class Tie extends Nave {
	private float cilindrada;

	
	public Tie() {
		super();
		this.cilindrada = 0.0f;
	}
	
	public Tie(String matricula, boolean imperio, float cilindrada) {
		super(matricula, imperio);
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
		return "Tie Fighter de la flota: " + ((imperio)? "imperial ": "de la república ") +  "con matricula: " + matricula + " y cilindrada de " + cilindrada + ".";
	}

	
}
