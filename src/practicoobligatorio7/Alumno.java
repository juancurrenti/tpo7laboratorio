package practicoobligatorio7;
//Clase Alumno
import java.util.ArrayList;

import java.util.List;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private List<Materia> materiasInscripto;
    private List<Alumno> alumnoInscripto;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasInscripto = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        if (!materiasInscripto.contains(materia)) {
            materiasInscripto.add(materia);
        }
    }

    public void agregarAlumno(Integer legajo, String apellido, String nombre) {
        if (!alumnoInscripto.containsAll(alumnoInscripto)) {
            alumnoInscripto.addAll(alumnoInscripto);
        }
    }

    public int cantidadMaterias() {
        return materiasInscripto.size();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasInscripto() {
        return materiasInscripto;
    }

    public void setMateriasInscripto(List<Materia> materiasInscripto) {
        this.materiasInscripto = materiasInscripto;
    }

    public List<Alumno> getAlumnoInscripto() {
        return alumnoInscripto;
    }

    public void setAlumnoInscripto(List<Alumno> alumnoInscripto) {
        this.alumnoInscripto = alumnoInscripto;
    }

}
