/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma;
        String cadena = ""; 
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int col = 0; col < notas.length; col++) {
              suma = suma + notas[fila][col];
            }
            cadena = String.format("%s Estudiante: %s tiene un promedio de %.2f\n",
                    cadena, 
                    estudiantes[fila],
                    suma);
        } 
        System.out.println(cadena);
    }
    
    

}
