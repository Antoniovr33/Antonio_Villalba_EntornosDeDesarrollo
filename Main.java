package Antonio_Villalba_EntornosDeDesarrollo;

public class Main {
    public static void main(String[] args) {
        // Instanciamos un cuadrado y un circulo
        Circulo circulo1 = new Circulo(3, "verde");
        Cuadrado cuadrado1 = new Cuadrado(3, 3, "rojo");

        // Calcula area cuadrado usando el método calcularArea
        double areaCuadrado = calcularAreaCuadrado(cuadrado1);
        System.out.println("Area cuadrado: " + areaCuadrado);

        // Calcula area circulo usando el método calcularArea
        double areaCirculo = calcularAreaCirculo(circulo1);
        System.out.println("Area circulo: " + areaCirculo);

        // Diferencia entre areas de cuadrado y circuloS
        double diferencia = calcularDiferencia(areaCuadrado, areaCirculo);
        System.out.println("Diferencia áreas: " + diferencia);

        // Imprimir datos
        imprimirResultados(cuadrado1, circulo1, diferencia);
    }

    private static double calcularAreaCuadrado(Cuadrado cuadrado) {
        return cuadrado.calcularArea();
    }

    private static double calcularAreaCirculo(Circulo circulo) {
        return circulo.calcularArea();
    }

    private static double calcularDiferencia(double areaCuadrado, double areaCirculo) {
        return areaCuadrado - areaCirculo;
    }

    private static void imprimirResultados(Cuadrado cuadrado, Circulo circulo, double diferencia) {
        System.out.println("Cuadrado: " + cuadrado);
        System.out.println("Circulo: " + circulo);
        System.out.println("Diferencia: " + diferencia);
    }
}

class Cuadrado {
    private double ladoA;
    private double ladoB;
    private String color;

    public Cuadrado(double ladoA, double ladoB, String color) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double calcularArea() {
        return ladoA * ladoB;
    }

    @Override
    public String toString() {
        return "Cuadrado [ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }
}

class Circulo {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", color=" + color + "]";
    }
}