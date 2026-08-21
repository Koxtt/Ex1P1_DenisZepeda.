/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1p1_deniszepeda;

import java.util.Scanner;

/**
 *
 * @author MARY
 */
public class Ex1P1_DenisZepeda {

    /**
     * @param args the command line arguments
     */
    static Scanner entry = new Scanner(System.in);

    public static void main(String[] args) {
        int opc = 0;
        System.out.println("--- Menu de opciones ---");
        System.out.println("1) Holocron Encriptado");
        System.out.println("2) Disenio de Tie Fighter");
        System.out.println("3) Cadena Escondida");
        System.out.println("Ingrese una opcion: ");
        opc = entry.nextInt();
        do {

            switch (opc) {
                case 1:
                    System.out.println("Holocron Encriptado");
                    System.out.println("Ingrese el mensaje al Templo Jedi: ");
                    String mensaje = entry.next();
                    System.out.println("Ingrese la palabra clave del holocron: ");
                    String clave = entry.next();
                    String mensajencript = ejercicioencrip(mensaje,clave);
                    System.out.println(mensajencript);
                    break;
                case 2:
                    System.out.println("Disenio de Tie Fighter");
                    int num = 0;
                    System.out.println("Ingrese dimensiones del nuevo tie fighter (Numero impar mayor o igual a 5)");
                    num = entry.nextInt();
                    //ejercicio2();
                    break;
                case 3:
                    System.out.println("Cadena Escondida");
                    break;
                case 4:
                    System.out.println("Saliendo del codigo");
                    break;
            }

        } while (opc != 4);
                    
    }
    
    public static String ejercicioencrip (String mensaje, String clave) {
        String resp = "";
        int posicion = 0;
        clave = clave.toLowerCase();
        for (int i = 0; i < clave.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isDigit(caracter)) {
                char lectura = clave.charAt(posicion%clave.length());
                int desicion = lectura-'a';
                char base;
                if (Character.isUpperCase(caracter)) {
                    base='A';
                }else{
                    base = 'a';
                }
                int pos=caracter-base;
                
                if (pos%2==0) {
                    pos=pos+desicion;
                }else{
                    pos=pos-desicion;
                }
                pos=(pos)+()
                }
            }
        }
    }






