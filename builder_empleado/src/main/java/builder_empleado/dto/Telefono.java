package builder_empleado.dto;

public class Telefono {

	private String numeroTelefono;
	private String extension;
	private String tipoNumeroTelefono;

	public Telefono() {
	}

	public Telefono(String numeroTelefono, String extension, String tipoNumeroTelefono) {
		super();
		this.numeroTelefono = numeroTelefono;
		this.extension = extension;
		this.tipoNumeroTelefono = tipoNumeroTelefono;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getTipoNumeroTelefono() {
		return tipoNumeroTelefono;
	}

	public void setTipoNumeroTelefono(String tipoNumeroTelefono) {
		this.tipoNumeroTelefono = tipoNumeroTelefono;
	}

	@Override
	public String toString() {
		return "Telefono [numeroTelefono=" + numeroTelefono + ", extension=" + extension
				+ ", tipoNumeroTelefono=" + tipoNumeroTelefono + "]";
	}

}
