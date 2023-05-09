package miHangar;

public abstract class Nave {
	protected String matricula;
	protected Flota flota;
	
	private enum Flota  {
		IMPERIO(0.5),
		REPUBLICA(0.75);
		
		private double tasa;
		
		Flota(double tasa) {
			this.setTasa(tasa);
		}
		public double getTasa() {
			return tasa;
		}
		public void setTasa(double tasa) {
			this.tasa = tasa;
		}
	}
	
	protected Nave() {
		matricula = "0000AAA";
		this.flota = Flota.IMPERIO;
	}
	
	protected Nave(String matricula, String flota) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Flota getFlota() {
		return flota;
	}

	public void setFlota(Flota flota) {
		this.flota = flota;
	}
	
	public void setFlota(String flota) {
		this.flota = (flota.toLowerCase().charAt(0) == 'i')? Flota.IMPERIO: Flota.REPUBLICA;
	}
	
	public double getTasa() {
		return flota.getTasa();
	}
	
	public String toString() {
		
	}
}