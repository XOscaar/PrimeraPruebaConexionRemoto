package Colegio;

import java.util.LinkedList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String fechaNacimiento;
	private LinkedList <Asignatura> asignaturas=new LinkedList<>();
	
	//constructor
	public Estudiante (String nombre,String apellido,String fechaNacimiento) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		System.out.println("se ha creado el estudiante "+nombre+" "+apellido+" con fecha de nacimiento "+fechaNacimiento);
	}
	
	//metodos
	//añadimos a la lista de Asignaturas la nueva asignatura por el final
	public void AnadirAsignatura(Asignatura Asignatura,double notaAsignatura) {
		this.asignaturas.addLast(Asignatura);
		//le damos nota a la asignatura
		asignaturas.getLast().setNotaAlumno(notaAsignatura);
		System.out.println("Se ha añadido la asignatura "+ Asignatura.getDenominacion()+" al estudiante "+nombre+". el estudiante ha sacado un "+asignaturas.getLast().getNotaAlumno());
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public LinkedList<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(LinkedList<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	//mostrar toda la informacion del estudiante
	public String infoEstudiante(Estudiante estudiante) {
		String resultado="El estudiante "+estudiante.getNombre()+" "+estudiante.getApellido()+" con fecha de nacimiento "+estudiante.getFechaNacimiento()+" se ha matriculado en "+estudiante.getAsignaturas().size()+" asignaturas.";
		
		return resultado;
	}
	
	//metodo para mostrar todas las asignaturas del estudiante con sus atrubutos
	public void listaAsignaturas () {
		
		for (int i=0;i<asignaturas.size();i++) {
			System.out.println(asignaturas.get(i).getDenominacion()+". nota: "+asignaturas.get(i).getNotaAlumno()+" curso: "+asignaturas.get(i).getCurso());
		}
		
	}
	//calcular nota media
	public double notaMedia () {
		double media=0;
		for (int i=0;i<asignaturas.size();i++) {
			media+=asignaturas.get(i).getNotaAlumno();
		}
		media= media/asignaturas.size();
		
		return media;	
	}
	
	
}
