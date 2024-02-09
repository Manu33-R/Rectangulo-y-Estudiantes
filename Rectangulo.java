public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{

    private double ancho;
    private double alto;

    public Rectangulo(int numlados, double ancho, double alto) {
        super(numlados);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho*alto;
    }

    @Override
    public double getPerimeter() {
        return ancho*2+alto*2;
    }

    @Override
    public void redimensionar(int x) {
        this.ancho = ancho*x;
        this.alto = alto*x;
    }

    @Override
    public int compareTo(Rectangulo o) {
        int comp = 0;
        if (this.getArea()<o.getArea())
            comp = -1;
        else if (this.getArea()>o.getArea())
            comp = 1;
        return comp;
    }
}
