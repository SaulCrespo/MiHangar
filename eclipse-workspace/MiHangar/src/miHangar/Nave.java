package miHangar;

public abstract class Nave implements Tasas {
	protected String matricula;
	protected boolean imperio;
	
	
	protected Nave() {
		matricula = "0000AAA";
		imperio = true;
	}
	
	protected Nave(String matricula, boolean imperio) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean getImperio() {
		return imperio;
	}

	public void setImperio(boolean imperio) {
		this.imperio = imperio;
	}
	
	public double getTasa(double importe) {
		return (imperio)? importe + importe * IMPERIO : importe + importe * REPUBLICA;
	}
}