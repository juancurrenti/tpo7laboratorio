
package practicoobligatorio7;

public class Colegio {
    public static void main(String[] args) {
        Materia inglesI = new Materia(1, "Ingles I", 1);
        Materia matematicas = new Materia(2, "Matematicas", 1);
        Materia laboratorio1 = new Materia(3, "Laboratorio 1", 1);

        Alumno lopezMartin = new Alumno(1001, "Lopez", "Martin");
        Alumno martinezBrenda = new Alumno(1002, "Martinez", "Brenda");

        lopezMartin.agregarMateria(inglesI);
        lopezMartin.agregarMateria(matematicas);
        lopezMartin.agregarMateria(laboratorio1);

        martinezBrenda.agregarMateria(inglesI);
        martinezBrenda.agregarMateria(matematicas);
        martinezBrenda.agregarMateria(laboratorio1);
        martinezBrenda.agregarMateria(laboratorio1);

        System.out.println("Cantidad de materias inscriptas de Lopez Martin: " + lopezMartin.cantidadMaterias());
        System.out.println("Cantidad de materias inscriptas de Martinez Brenda: " + martinezBrenda.cantidadMaterias());
    }
}
