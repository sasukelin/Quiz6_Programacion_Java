class Rectangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;

    public Rectangulo(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double obtenerArea() {
        return lado1 * lado2;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * (lado1 + lado2);
    }
}