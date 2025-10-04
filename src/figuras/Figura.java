
package figuras;

public abstract class Figura {
    protected String color;
    protected int lados;

    public Figura() {}

    public Figura(String color, int lados) {
        this.color = color;
        this.lados = lados;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getLados() { return lados; }
    public void setLados(int lados) { this.lados = lados; }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " color=" + color + " lados=" + lados;
    }
}
