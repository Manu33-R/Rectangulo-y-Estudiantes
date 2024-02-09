public class Estudiante implements Comparable<Estudiante>{
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    @Override
    public int compareTo(Estudiante o) {
        int comp = 0;
        if (this.altura>o.altura)
        comp = -1;
        else if (this.altura<o.altura)
        comp = 1;
        else{
            if (this.edad>o.edad)
                comp = -1;
            else if (this.edad<edad)
                comp = 1;
        }
        return comp;
    }
}
