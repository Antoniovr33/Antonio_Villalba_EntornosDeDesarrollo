package Antonio_Villalba_EntornosDeDesarrollo;

public class Avr_Circulo {
    private double radio;
    private String color;

    // Constructor por defecto
    public Avr_Circulo() {
    }

    // Constructor con todos los argumentos (excepto id)
    public Avr_Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    // Getters y Setters (excepto id)
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Método ToString (excepto id)
    @Override
    public String toString() {
        return "Avr_Circulo{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}