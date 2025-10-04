
package figuras;

public class Cuadrilatero extends Figura {
    protected Punto v1;
    protected Punto v2;
    protected Punto v3;
    protected Punto v4;

    public Cuadrilatero(Punto v1, Punto v2, Punto v3, Punto v4, String color) {
        super(color, 4);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public Punto getV1() { return v1; }
    public void setV1(Punto v1) { this.v1 = v1; }

    public Punto getV2() { return v2; }
    public void setV2(Punto v2) { this.v2 = v2; }

    public Punto getV3() { return v3; }
    public void setV3(Punto v3) { this.v3 = v3; }

    public Punto getV4() { return v4; }
    public void setV4(Punto v4) { this.v4 = v4; }

    @Override
    public double perimetro() {
        return v1.distancia(v2) + v2.distancia(v3) + v3.distancia(v4) + v4.distancia(v1);
    }

    @Override
    public double area() {
        // Shoelace formula for polygon area (quadrilateral)
        double x1 = v1.getX(), y1 = v1.getY();
        double x2 = v2.getX(), y2 = v2.getY();
        double x3 = v3.getX(), y3 = v3.getY();
        double x4 = v4.getX(), y4 = v4.getY();
        double sum1 = x1*y2 + x2*y3 + x3*y4 + x4*y1;
        double sum2 = y1*x2 + y2*x3 + y3*x4 + y4*x1;
        double area = Math.abs(sum1 - sum2) / 2.0;
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + " v1=" + v1 + " v2=" + v2 + " v3=" + v3 + " v4=" + v4;
    }
}
