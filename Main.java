import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de figura (1: Círculo, 2: Rectángulo, 3: Triángulo):");
        int tipoFigura = scanner.nextInt();

        FiguraGeometrica figura = null;

        switch (tipoFigura) {
            case 1:

                String nombreCirculo = scanner.nextLine();
                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();
                figura = new Circulo(nombreCirculo, radio);
                break;
            case 2:

                String nombreRectangulo = scanner.nextLine();
                System.out.println("Ingrese el valor del lado1 del rectángulo:");
                double lado1 = scanner.nextDouble();
                System.out.println("Ingrese el valor del lado2 del rectángulo:");
                double lado2 = scanner.nextDouble();
                figura = new Rectangulo(nombreRectangulo, lado1, lado2);
                break;
            case 3:

                String nombreTriangulo = scanner.nextLine();
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = scanner.nextDouble();
                figura = new Triangulo(nombreTriangulo, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
        }

        if (figura != null) {
            System.out.println("Área de la figura: " + figura.obtenerArea());
            System.out.println("Perímetro de la figura: " + figura.obtenerPerimetro());
        }

        scanner.close();
    }
}
