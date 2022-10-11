/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author tggtr
 */
public class MWhile {

    public int cantVocales(String texto) {
        int cont = 0, i = 0;
        char vocales[] = {'a', 'e', 'i', 'o', 'u'};
        while (i < texto.length()) {
            for (int k = 0; k < 5; k++) {
                if (texto.toLowerCase().charAt(i) == vocales[k]) {
                    cont++;
                }
            }
            i++;
        }
        return cont;
    }

    public double sumar(ArrayList<Double> nums) {
        int i = 0, suma = 0;
        while (i < nums.size()) {
            if (nums.get(i) != -1) {
                suma += nums.get(i);
            }
            i++;
        }
        return suma;
    }

    public int numPerfecto(int num) {
        int suma = 0;
        int div = 1;
        while (div < num) {
            if (num % div == 0) {
                suma += div;
            }
            div++;
        }
        return suma;
    }

    public int cantidad(ArrayList<Integer> cantidad) {
        int cont = 0, i = 0;
        while (i < cantidad.size()) {
            if (cantidad.get(i) >= 70 && cantidad.get(i) <= 100) {
                cont++;
            }
            i++;
        }
        return cont;
    }

    public int cantCuota(ArrayList<Double> cuotas) {
        int i = 0;
        double suma = 0;
        while (suma < 1000) {
            suma += cuotas.get(i);
            i++;
        }
        return i;
    }

}
