package AulaInterface;

public class Quadrado implements FiguraGeometrica {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        int area;
        area = lado * lado;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro;
        perimetro = lado * 4;
        return perimetro;

    }
}
