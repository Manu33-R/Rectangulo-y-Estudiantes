public abstract class Forma {
    private int numlados;

    public Forma(int numlados) {
        this.numlados = numlados;
    }

    public int getNumlados() {
        return numlados;
    }

    public void setNumlados(int numlados) {
        this.numlados = numlados;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
