
public class Alumno {
	
	private String nombre;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	private double nota;
	
	
	public Alumno(String nombre, double nota)
	{
		this.nombre=nombre;
		this.nota=nota;
	}

}
