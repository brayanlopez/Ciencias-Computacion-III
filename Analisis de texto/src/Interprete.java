/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author estudiantes
 */
public class Interprete {

    String[] palabrasReservadas = {"if", "else", "for", "while", "do", };
    String var = "";

    void comprobar() {
        int i = 0;
        while (i < 5) {
            if (var.equals(palabrasReservadas[i])) {
                System.out.println("Condicional");
            }
            i++;
        }
    }

    /**
     * Muestra el contenido de un arhivo que se le pase.
     */
    public void muestraContenido(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        while ((cadena = b.readLine()) != null) {
            System.out.println(cadena);
        }
        b.close();
    }

}
