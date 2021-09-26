
public class Login {

	private String numeroCuenta;
	private String nombreTitular;
	private Double saldoCuenta;
	private Double interesAnual;
	private Boolean Administrador;
	
	

	public Login(String numeroCuenta, String nombreTitular, Double saldoCuenta, Double interesAnual,
			Boolean administrador) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.nombreTitular = nombreTitular;
		this.saldoCuenta = saldoCuenta;
		this.interesAnual = interesAnual;
		Administrador = administrador;
	}
	public Login(Boolean administrador) {
		super();
		this.numeroCuenta = "1234";
		this.nombreTitular = "Juan";
		this.saldoCuenta = 150.50;
		this.interesAnual = 1.25;
		Administrador = administrador;
	}
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public String getNombreTitular() {
		return nombreTitular;
	}
	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	public Double getSaldoCuenta() {
		return saldoCuenta;
	}
	public void setSaldoCuenta(Double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
	public Double getInteresAnual() {
		return interesAnual;
	}
	public void setInteresAnual(Double interesAnual) {
		this.interesAnual = interesAnual;
	}
	
	
	public void muestraMenu() {
		String format;
		if (Administrador) {
			format = "Número de la cuenta: " + this.numeroCuenta + "\n"+
					" Nombre titular: " + this.nombreTitular + "\n"+
					" Saldo Cuenta: " + this.saldoCuenta + "\n"+
					" Interes anual: " + this.interesAnual + "\n"+
					" Salir";
		} else {
			format = "Depositar: " + "\n"+
					" Girar: " +  "\n"+
					" Consultar saldo: " +  "\n"+
					" Convertir la moneda de euro a USD: " + "\n"+
					" Salir";
		}
		System.out.println(format);
		
		
	}
	
	
	
	
	
}