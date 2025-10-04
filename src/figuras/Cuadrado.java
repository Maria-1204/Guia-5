
package figuras;

public class Cuadrado extends Cuadrilatero {
    public Cuadrado(Punto v1, Punto v2, Punto v3, Punto v4, String color) {
        super(v1, v2, v3, v4, color);
    }

    // Optionally override area/perimetro if we want assumptions (but parent methods work)
    // We'll keep parent implementations (shoelace and perimetro from distances).
}
