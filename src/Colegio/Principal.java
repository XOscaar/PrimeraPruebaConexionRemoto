package Colegio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// creamos el estudiante
		Scanner scn=new Scanner(System.in);
		System.out.println("Dime que estudiante quieres crear. (estructura: nombre apellido fecha_nacimiento)");
		String nombre=scn.next();
		String apellido=scn.next();
		String fecha=scn.next();
		Estudiante estudiante=new Estudiante (nombre,apellido,fecha);
		//creamos las asignaturas
		Asignatura asignatura1=new Asignatura("Lengua",1);
		Asignatura asignatura2=new Asignatura("Mates",1);
		Asignatura asignatura3=new Asignatura("Historia",2);
		Asignatura asignatura4=new Asignatura("Ingles",2);
		Asignatura asignatura5=new Asignatura("Valores",3);
		//matriculamos al estudiante
		estudiante.AnadirAsignatura(asignatura1,5);
		estudiante.AnadirAsignatura(asignatura2,5.1);
		estudiante.AnadirAsignatura(asignatura3,8.2);
		estudiante.AnadirAsignatura(asignatura4,4.8);
		estudiante.AnadirAsignatura(asignatura5,6.8);
		
		

		
		System.out.println("-----------------------");
		System.out.println("-----DATOS FINALES-----");
		System.out.println("-----------------------");		
		System.out.println(estudiante.infoEstudiante(estudiante));
		System.out.println("notas de las asignaturas: ");
		estudiante.listaAsignaturas();
		System.out.println("nota media: "+estudiante.notaMedia());
		
		
		
	}

}
