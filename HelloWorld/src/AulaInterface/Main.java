package AulaInterface;

public class Main {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(2);
        System.out.println(" Area " + quadrado.getArea());
        System.out.println(" Perimetro " + quadrado.getPerimetro() );
        System.out.println( " Nome " + quadrado.getNomeFigura());
    }
}
