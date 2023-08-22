package test.java.test;

public class Asiento {
    String color;
    int precios;
    int registro;

    void cambiarColor(String color) {
        if (color.equals("rojo") || color.equals("verde") || color.equals("amarillo")||color.equals("negro")||color.equals("blanco")) {
            this.color = color;
        }
    }
}
