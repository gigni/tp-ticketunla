package ticketUNLa;
import java.util.*;



public class Usuario {
	protected long id;
	protected int dni;
	protected String nombre;
	protected String apellido;
	protected GregorianCalendar nacimiento;
	
	public Usuario(long id, int dni, String nombre, String apellido, GregorianCalendar nacimiento) {
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
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
	public GregorianCalendar getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(GregorianCalendar nacimiento) {
		this.nacimiento = nacimiento;
	}

	
	public int calcularEdad() {
		GregorianCalendar FechaActual = new GregorianCalendar();
		
		
		/*long edad;
		edad=FechaActual.getTimeInMillis()-nacimiento.getTimeInMillis();
		edad=edad/(1000*60*60*24);
		return edad/365;*/
		
		
		int diffYear = FechaActual.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
	    int diffMonth = FechaActual.get(Calendar.MONTH) - nacimiento.get(Calendar.MONTH);
	    int diffDay = FechaActual.get(Calendar.DAY_OF_MONTH) - nacimiento.get(Calendar.DAY_OF_MONTH);
	    
	    // Si está en ese año pero todavía no los ha cumplido
	    
	    if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
	        diffYear = diffYear - 1;
	    }
	    
	    return diffYear;
		
		
	}

@Override
public String toString() {
	return "Usuario: dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido;
}
}
