import java.util.Arrays;


public class MainEstudiante {
    public static void main(String[] args) {
        System.out.println();
        Estudiante e1 = new Estudiante("Patri",12,170);
        Estudiante e2 = new Estudiante("Manuel",43,173);
        Estudiante e3 = new Estudiante("Javier",72,189);
        Estudiante e4 = new Estudiante("Alicia",52,168);
        Estudiante e5 = new Estudiante("Alberto",35,189);
        Estudiante[] arrayest = {e1,e2,e3,e4,e5};
        System.out.println("---Estudiantes sin ordenar---");
        for (Estudiante value : arrayest) {
            System.out.println(value.toString());
        }
        System.out.println();
        System.out.println("---Estudiantes ordenados---");
        Arrays.sort(arrayest);
        for (Estudiante estudiante : arrayest) {
            System.out.println(estudiante.toString());
        }
    }
}
