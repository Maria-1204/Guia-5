
package presentacion;

import figuras.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("== Figuras: calculo de area y perimetro ==");

        // Squares as specified
        Cuadrado cuadrado1 = new Cuadrado(
            new Punto(1,1),
            new Punto(3,1),
            new Punto(3,3),
            new Punto(1,3),
            "amarillo"
        );

        Cuadrado cuadrado2 = new Cuadrado(
            new Punto(1,1),
            new Punto(4,1),
            new Punto(4,4),
            new Punto(1,4),
            "verde"
        );

        Triangulo triangulo1 = new Triangulo(
            new Punto(1,-4),
            new Punto(1,4),
            new Punto(4,4),
            "rojo"
        );

        Triangulo triangulo2 = new Triangulo(
            new Punto(-255,-3),
            new Punto(4,4),
            new Punto(1,-4),
            "azul"
        );

        imprimir(cuadrado1);
        imprimir(cuadrado2);
        imprimir(triangulo1);
        imprimir(triangulo2);

        System.out.println();
        System.out.println("== Otros ejemplos: 3 cuadriláteros y 3 triángulos ==");

        // Three different quadrilaterals (including a trapezoid)
        Cuadrilatero trapecio = new Cuadrilatero(
            new Punto(0,0),
            new Punto(4,0),
            new Punto(3,2),
            new Punto(1,2),
            "morado"
        ); // isosceles trapezoid

        Cuadrilatero rombo = new Cuadrilatero(
            new Punto(0,0),
            new Punto(2,1),
            new Punto(0,2),
            new Punto(-2,1),
            "naranja"
        ); // rhombus-like

        Cuadrilatero rect = new Cuadrilatero(
            new Punto(0,0),
            new Punto(5,0),
            new Punto(5,2),
            new Punto(0,2),
            "gris"
        ); // rectangle

        imprimir(trapecio);
        imprimir(rombo);
        imprimir(rect);

        // Three different triangles
        Triangulo t1 = new Triangulo(new Punto(0,0), new Punto(4,0), new Punto(0,3), "cian"); // right triangle
        Triangulo t2 = new Triangulo(new Punto(0,0), new Punto(2,0), new Punto(1,Math.sqrt(3)), "verde"); // equilateral approx
        Triangulo t3 = new Triangulo(new Punto(-1,0), new Punto(1,0), new Punto(0,2), "rosa"); // isosceles

        imprimir(t1);
        imprimir(t2);
        imprimir(t3);

        System.out.println("\nFin del programa.");
    }

    private static void imprimir(figuras.Figura f) {
        System.out.println("\n" + f.toString());
        System.out.printf("Area: %.4f\n", f.area());
        System.out.printf("Perimetro: %.4f\n", f.perimetro());
    }
}
