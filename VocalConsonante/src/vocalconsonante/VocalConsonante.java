/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalconsonante;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class VocalConsonante {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra
        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine().toLowerCase(); // Convertir la palabra a minúsculas

        // Inicializar contadores de vocales y consonantes
        int contadorVocales = 0;
        int contadorConsonantes = 0;

        // Recorrer cada carácter de la palabra
        for (char c : palabra.toCharArray()) {
            if (esVocal(c)) {
                contadorVocales++;
            } else if (esConsonante(c)) {
                contadorConsonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("Cantidad de vocales: " + contadorVocales);
        System.out.println("Cantidad de consonantes: " + contadorConsonantes);
    }

    // Método para verificar si un carácter es una vocal
    private static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    // Método para verificar si un carácter es una consonante
    private static boolean esConsonante(char c) {
        return c >= 'a' && c <= 'z' && !esVocal(c);
    }
}
