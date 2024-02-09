import java.util.Arrays;
import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        while (cantidad<2){

            System.out.println();
            System.out.println("---Introduce rectangulos para ordenarlos por el area---");
            System.out.println("¿Cuántos rectangulos quieres crear? ");
            cantidad = sc.nextInt();
            if (cantidad<2){
                System.out.println("Introduce mas de un rectangulo.");
            }else{
                Rectangulo[] arrayrect = new Rectangulo[cantidad];
                double ancho;
                double alto;
                System.out.println("Crea " + cantidad + " rectangulos con su ancho y alto.");
                for (int i = 0; i<cantidad; i++){
                    System.out.println("Rectangulo " + (i+1));
                    System.out.println("Introduce el ancho del rectangulo: ");
                    ancho = sc.nextDouble();
                    System.out.println("Introduce el alto del rectangulo: ");
                    alto = sc.nextDouble();
                    arrayrect[i] = new Rectangulo(4,ancho,alto);
                }
                System.out.println();
                System.out.println("---Rectangulos introducidos---");
                for (int j = 0; j<arrayrect.length;j++) {
                    System.out.println("Area del " + (j+1) + "º rectangulo: " + arrayrect[j].getArea());
                }
                System.out.println();
                System.out.println("---Rectangulos ordenados por area---");
                //Rectangulos ordenados por area
                Arrays.sort(arrayrect);
                for (Rectangulo rectangulo:arrayrect) {
                    System.out.println(rectangulo.getArea());
                }
            }
        }



        System.out.println();
        Rectangulo r2 = new Rectangulo(4,2,5);
        Rectangulo r3 = new Rectangulo(4,3,4);
        System.out.println("---Comparacion Rectangulo---");
        System.out.println("Area del rectangulo r2: " + r2.getArea());
        System.out.println("Area del rectangulo r3: " + r3.getArea());
        if (r2.compareTo(r3) < 0)
            System.out.println("El area del rectangulo r2 es menor.");
        else if (r2.compareTo(r3) > 0)
            System.out.println("El area del rectangulo r2 es mayor.");
        else
            System.out.println("El area de los rectangulos es igual.");
    }
}
