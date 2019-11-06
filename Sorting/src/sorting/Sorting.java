/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Vector;

/**
 *
 * @author Walter Ariel Baya
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] A = new int[100];   //creo un Array de tamaño 1000 para probar
        for (int i = 0; i < A.length; i++) {
            int valor = (int) (Math.random() * A.length);
            A[i] = valor;
        }
        //Impresion inicial
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println("\n");

        //Ejercicio 18 
        //1 Counting Sort
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[A[i]] = B[A[i]] + 1;
        }
        int indice = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[i]; j++) {
                A[indice] = i;
                indice++;
            }
        }
        //impresion luego de terminar de ordenar
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
        System.out.println("\n");

    }

}
