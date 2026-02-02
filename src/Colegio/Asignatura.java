package Colegio;

public class Asignatura {
	private String denominacion;
	private double notaAlumno;
	private int curso;
	
	
	//constructor
	public Asignatura (String denominacion,int curso) {
		this.denominacion=denominacion;
		this.curso=curso;
		System.out.println("se ha creado una asignatura llamada "+denominacion+" en el curso "+curso);
	}
	
	//metodos (getters y setters)
	
	public String getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}
	public double getNotaAlumno() {
		return notaAlumno;
	}
	public void setNotaAlumno(double notaAlumno) {
		this.notaAlumno = notaAlumno;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
}
