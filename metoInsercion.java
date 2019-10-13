/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metoInsercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * Metodo de ordenamiento por insercion
 * Comprobar si el elemento de su izquierda ya es menor que el
 */

/**
 *
 * Felix Castro
 */
public class metoInsercion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int vector[];
        int nElem;
        int pos;
        int aux;
        
        nElem = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "
                + "de elementos para el vector"));
        
        vector = new int[nElem];
        
        for (int i = 0; i < nElem; i++) {
            System.out.println((i+1)+". Digite un numero");
            vector [i] = entrada.nextInt();
        }
        
        //mostramos el vector como se ingreso
        System.out.println("Vector en el orden ingresado");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        //metodo insercion
        for (int i = 0; i < nElem; i++) {
            pos = i;//seleccionador de posicion
            aux = vector[i];//elemento con el que se va comparar
            
            while ((pos > 0) && (vector[pos-1] > aux)) {                
                vector[pos] = vector[pos-1];
                pos--;
            }
            
            vector[pos] = aux;
        }
        
        System.out.println("Vector en orden ascendente");
        for (int i = 0; i < nElem; i++) {
            System.out.println(vector[i]);
        }
        
        System.out.println("Vector en orden descendente");
        for (int i = (nElem-1); i >= 0; i--) {
            System.out.println(vector[i]);
        }
    }
}
