/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class tareaString { //DECLARACION DE UNA CLASES
    
    public static void main (String[] args){ // DECLARACION DE UN METOD
    String cadena = "el dia de ayer margarita julia y jorge salieron de excursion";
    
    obtenerVocales(cadena);
    separarPorEspacios(cadena);
    cadena = reemplazarLetras(cadena);
    System.out.println("Cadena con letras reemplazadas: " 
            + cadena);
    
    
    String cadenaInvertida = invertirCadena(cadena);
        System.out.println("cadena invertida:"
                + cadenaInvertida);
    }

    public static void obtenerVocales(String cadena) {
    
       int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = ( cadena.charAt(i));
            if (letra == 'a') {
                contA++;
            } else if (letra == 'e') {
                contE++;
            } else if (letra == 'i') {
                contI++;
            } else if (letra == 'o') {
                contO++;
            } else if (letra == 'u') {
                contU++;
            }
        }        
        System.out.println("Numero de vocales de la cadena");
        System.out.println("numero de 'a': " + contA + "\nnumero de 'e': " + contE +
                       "\nnumero de 'i': " + contI + "\nnumero de 'o': " + contO +
                       "\nnumero de 'u': " + contU);
}
     public static void separarPorEspacios(String cadena) {
        // Utilizar el método split para separar la cadena por espacios
        String[] palabras = cadena.split(" ");

        // Imprimir cada palabra resultante
        System.out.println("Palabras separadas por espacios:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
     }
      public static String reemplazarLetras(String cadena) {
        // Reemplazar 'o' con '$' y 'a' con '@'
        cadena = cadena.replace('o', '$');
        cadena = cadena.replace('a', '@');
        
        return cadena;
        
    }
      public static String invertirCadena(String cadena) {
        // Crear un StringBuilder y agregar cada carácter en orden inverso
        StringBuilder cadenaInvertida = new StringBuilder();
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida.append(cadena.charAt(i));
        }
        
        // Convertir StringBuilder a String
        return cadenaInvertida.toString();
    }
}
