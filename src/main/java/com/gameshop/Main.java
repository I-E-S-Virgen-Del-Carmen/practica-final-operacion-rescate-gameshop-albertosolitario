/**
 * @author Alberto
 */

package com.gameshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando Sistema GameShop...\n");

        GestorInventario inventario = new GestorInventario();
        ProcesadorVentas ventas = new ProcesadorVentas();
        SistemaRecompensasVip recompensas = new SistemaRecompensasVip();

        System.out.println("--- 1. TEST DE INVENTARIO ---");
        String[] juegos = {"Cyberpunk", "Zelda", "Mario Kart", "Halo"};
        int[] stock = {10, 2, 15, 4};
        inventario.procesarInventario(juegos, stock);

        System.out.println("\n--- 2. TEST DE VENTAS ---");
        double precioFinal = ventas.c(100.0, true);
        System.out.println("Precio final cobrado al VIP: " + precioFinal + " EUR");

        System.out.println("\n--- 3. TEST DE RECOMPENSAS ---");
        System.out.println(recompensas.generarReporte(150));

        System.out.println("Comprobando cliente anónimo...");
        boolean esVip = recompensas.comprobarVip(null);
        System.out.println("¿Es VIP? " + esVip);
    }
}