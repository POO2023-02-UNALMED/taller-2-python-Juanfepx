package test.java.test;

public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento!= null){
                contador++;
            }
        }
        return contador;
    }

    String verificarintegridad() {
        boolean valor = true;
        if (motor.registro == this.registro) {
            int origen = motor.registro;
            for (Asiento asiento : asientos) {
                if (asiento.registro != origen) {
                    valor = false;
                    break;
                }
            }
        }
        if (motor.registro == this.registro && valor) {
            return "Auto original";
        } else {
            return "Las piezas no son originales";
        }
    }
}
