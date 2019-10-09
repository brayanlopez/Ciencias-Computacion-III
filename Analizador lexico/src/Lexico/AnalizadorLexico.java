/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lexico;

import java.io.File;

/**
 *
 * @author estudiantes
 */
public class AnalizadorLexico {

    public static void main(String[] args) {
        String camino = "C:\\Users\\estudiantes\\Downloads\\Ciencias-Computacion-III-master\\Analizador lexico\\src\\Lexico\\Analizador_Lexico.flex";
        generarLex(camino);
    }

    public static void generarLex(String camino) {
        File arc = new File(camino);
        JFlex.Main.generate(arc);
    }
}
