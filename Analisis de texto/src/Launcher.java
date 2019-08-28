package Principal;

import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author estudiantes
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        Interprete intPrueba = new Interprete();
        
        String ruta = "C:\\Users\\estudiantes\\Downloads\\texto.txt";
        
        intPrueba.muestraContenido(ruta);

    }
}
