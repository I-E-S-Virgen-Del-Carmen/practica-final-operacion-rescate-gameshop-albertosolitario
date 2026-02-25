/**
 * @author Alberto
 */

package com.gameshop;

public class GestorInventario {

    public void procesarInventario(String[] n, int[] c) {
        int t = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.println("Revisando stock de: " + n[i]);

            if (c[i] <= 5) {
                System.out.println("¡ALERTA! Pedir más copias de " + n[i]);
            }

            t = t + c[i];
        }
        System.out.println("Total de juegos en el almacén: " + t);
    }
}