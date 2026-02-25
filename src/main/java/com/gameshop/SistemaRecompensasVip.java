/**
 * @author Alberto
 */
package com.gameshop;

public class SistemaRecompensasVip {

    public static final int UMBRAL_RECOMPENSA_ORO = 100;
    public static final int UMBRAL_RECOMPENSA_ORO2 = 500;

    /**
     * @param tipoCliente Es el texto que recibimos
     * @return Devuelve 'true' si el texto coincide exactamente con "Premium".
     */

    public boolean comprobarVip(String tipoCliente) {
        if ("Premium".equals(tipoCliente)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param punto es la cantidad de puntos que ha generado el cliente
     * @return string que contiene las estrellas y el mensaje de si el cliente es leyenda o de oro
     */


    public String generarReporte(int puntos) {
        String reporteFinal = "";

        for (int i = 0; i < puntos; i++) {
            reporteFinal = reporteFinal + "*";
        }

        if (puntos > 0) {
            if (puntos >= UMBRAL_RECOMPENSA_ORO) {
                if (puntos >= UMBRAL_RECOMPENSA_ORO2) {
                    reporteFinal = reporteFinal + " ¡CLIENTE LEYENDA!";
                } else {
                    reporteFinal = reporteFinal + " ¡CLIENTE ORO!";
                }
            }
        }

        return reporteFinal;
    }
}