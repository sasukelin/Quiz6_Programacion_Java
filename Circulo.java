class Circulo extends FiguraGeometrica {
    private double radio;
    private double diametro;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
        this.diametro = diametro;
    }

    public double obtenerRadio() {
        return radio;
    }

    public double obtenerDiametro() {
        return 2 * radio; // Cálculo del diámetro
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Radio del círculo: " + obtenerRadio());
        System.out.println("Diámetro del círculo: " + obtenerDiametro());
    }

    @Override
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }
}
