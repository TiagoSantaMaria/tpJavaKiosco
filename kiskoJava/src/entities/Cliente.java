package entities;

public class Cliente {
	private int dniCliente;
	private String nombre;
	private String apellido;
	private String mail;
	private String fechaNac;
	private String usuario;
	private String contraseña;
	private int nroTarjeta;
	private String rol;
	
	
	public int getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(int dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public int getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(int nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Cliente() {
		super();
	}
	public Cliente(int dniCliente, String nombre, String apellido, String mail, String fechaNac, String usuario,
			String contraseña, int nroTarjeta, String rol) {
		super();
		this.dniCliente = dniCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.fechaNac = fechaNac;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.nroTarjeta = nroTarjeta;
		this.rol = rol;
	}
}
