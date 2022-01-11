/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double suma = 0;
        int fila;
        int[][] ventas = new int[2][5];
        String[] vendedores = {"Jerry Ponce", "Gabriela Lewis"};
        for (fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                System.out.println("Ingres los valores del dia " + col);
                ventas[fila][col] = entrada.nextInt();
                suma = suma + ventas[fila][col];
            }
            System.out.println("Vendedor(a)" + vendedores[fila]);
        }     
        System.out.println("Han realizado un total de " + suma + " en ventas.");
    }
}
