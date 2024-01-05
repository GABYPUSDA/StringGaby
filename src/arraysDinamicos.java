
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class arraysDinamicos {
    public static void main(String[] args) {
        // Declaración e inicialización de un ArrayList dinámico de enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Agregar elementos al ArrayList
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        // Imprimir el contenido del ArrayList
        System.out.println("Contenido del ArrayList de enteros:");
        for (int i = 0; i < numeros.size(); i++) { //el size utiliza para saber la parada de la posicion del tamaño de objetos
            System.out.print(numeros.get(i) + " ");
        }

        // Agregar un nuevo elemento al ArrayList
        numeros.add(6);

        // Imprimir el contenido actualizado del ArrayList
        System.out.println("\nContenido actualizado del ArrayList de enteros:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
