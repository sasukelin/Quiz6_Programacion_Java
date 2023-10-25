import java.util.Scanner;

class FiguraGeometrica {

    public double base;
    public double altura;
    private double radio;
    private double diametro;
    public String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
        this.altura = altura;
        this.base = base;
        this.radio = radio;
    }

    public double obtenerArea() {
        return 0.5 * base * altura;
    }

    public double obtenerPerimetro() {
        double lado1 = base;
        double lado2 = Math.sqrt((base / 2) * (base / 2) + altura * altura);
        double lado3 = lado2;

        return lado1 + lado2 + lado3;
    }
    public double obtenerDiametro() {
        return 2 * radio;
    }
    public void mostrarInfo() {
        System.out.println("Nombre de la figura: " + nombre);
    }





}