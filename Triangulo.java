class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double obtenerPerimetro() {
        // Implementa el cálculo del perímetro de un triángulo si es necesario
        return 0.0;
    }
}