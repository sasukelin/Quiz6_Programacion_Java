import java.awt.geom.Area;

/**
 * Clase para una Figura Geometrica
 */
class FiguraGeometrica {

    private String nombre;
    private String color;

    /**
     * Constructor de la clase.
     *
     * @param nombre nombre del triangulo

     * @param color color del triangulo

     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    /**
     * Método para imprimir en consola el nombre y color de la figura geometrica y obtener el Area
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerArea() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        return 0.0;
    }
    /**
     * Método para obtener el promedio de la figura geometrica
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public double obtenerPerimetro() {
        return 0.0;
    }

}