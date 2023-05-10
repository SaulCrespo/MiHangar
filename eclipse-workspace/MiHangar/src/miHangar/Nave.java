package miHangar;

public abstract class Nave {
	protected String matricula;
	protected Flota flota;
	
	protected enum Flota  {
		IMPERIO(0.5, "Imperio"),
		REPUBLICA(0.75, "Republica");
		
		private double tasa;
		private String flota;
		
		Flota(double tasa, String flota) {
			setTasa(tasa);
			this.flota = flota;
		}
		public double getTasa() {
			return tasa;
		}
		public void setTasa(double tasa) {
			this.tasa = tasa;
		}
		
		public String getFlota() {
			return flota;
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
}