/**
 * Clase Circulo que hereda de FiguraGeometrica.
 */
class  Circulo extends FiguraGeometrica {

    private  double radio;
    /**
     * Constructor de la clase Circulo.
     *
     * @param radio
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */
    public Circulo( String nombre, String color, double radio) {
        super  (nombre, color);
        this.radio=radio;

    }
    /**
     * Método para obtener el area del circulo
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    @Override
    public double obtenerArea() {
        super.obtenerArea();
        double area= Math.PI * radio * radio;
        System.out.println("Area: " + area);
        return  area;
    }

    /**
     * Método para obtener el perimetro del circulo
     *
     *
     * Complejidad temporal: O(1) Tiempo constante.
     */

    @Override
    public double obtenerPerimetro() {
        super.obtenerPerimetro();
        double  perimetro= 2 * Math.PI * radio;
        System.out.println("Perimetro: " +  perimetro);
        return  perimetro;
    }
}