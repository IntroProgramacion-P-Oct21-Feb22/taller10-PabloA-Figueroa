/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] datos = new double[2][2];
        for (int fila = 0; fila < datos.length; fila++) {
            for (int col = 0; col < datos[fila].length; col++) {
                System.out.println("Ingres los datos numericos");
                datos[fila][col] = entrada.nextDouble();
                System.out.println("valor" + datos[fila][col]);
            }
        }
    }
}
