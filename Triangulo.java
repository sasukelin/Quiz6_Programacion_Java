/**
 * Clase Triangulo que hereda de FiguraGeometrica.
 */
class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    /**
     * Constructor de la clase Rectangulo.
     *
     * @param base
     * @param altura
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Triangulo( String nombre, String color, double base, double altura) {
        super  (nombre, color);
        this.base = base;
        this.altura = altura;
    }
    /**
     * Método para obtener el area del Triangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area=   (base * altura)/2;
        System.out.println("Area: " + area);
        return  area;
    }
    /**
     * Método para obtener el perimetro del Triangulo.
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double  perimetro= base*3;
        System.out.println("Perimetro: " +  perimetro);
        return  perimetro;
    }
}