
package figuras;

public class Triangulo extends Figura {
    protected Punto v1;
    protected Punto v2;
    protected Punto v3;

    public Triangulo(Punto v1, Punto v2, Punto v3, String color) {
        super(color, 3);
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public Punto getV1() { return v1; }
    public void setV1(Punto v1) { this.v1 = v1; }

    public Punto getV2() { return v2; }
    public void setV2(Punto v2) { this.v2 = v2; }

    public Punto getV3() { return v3; }
    public void setV3(Punto v3) { this.v3 = v3; }

    private double ladoA() { return v1.distancia(v2); }
    private double ladoB() { return v2.distancia(v3); }
    private double ladoC() { return v3.distancia(v1); }

    @Override
    public double perimetro() {
        return ladoA() + ladoB() + ladoC();
    }

    @Override
    public double area() {
        // Heron's formula
        double a = ladoA();
        double b = ladoB();
        double c = ladoC();
        double s = (a + b + c) / 2.0;
        double val = s * (s - a) * (s - b) * (s - c);
        if (val <= 0) return 0.0;
        return Math.sqrt(val);
    }

    @Override
    public String toString() {
        return super.toString() + " v1=" + v1 + " v2=" + v2 + " v3=" + v3;
    }
}
