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
                    entry.nextLine();
                    String encrip = "";
                    String desencrip = "";
                    System.out.println("Holocron Encriptado");
                    System.out.print("Ingrese el mensaje al Templo Jedi: ");
                    String mensaje = entry.nextLine();
                    entry.nextLine();
                    System.out.print("Ingrese la palabra clave del holocron: ");
                    String clave = entry.nextLine();
                    String mensajencript = ejercicioencrip(mensaje, clave);
                    System.out.println(mensajencript);
                    System.out.println("Desea encriptar (1) o (2) desencriptar el mensaje");
                    int opc1 = entry.nextInt();
                    switch (opc1) {
                        case 1:
                            encrip = ejercicioencrip(mensaje, clave);
                            System.out.println("A escondido el mensaje de las tropas imperiales. Su mensaje encriptado es: "+encrip);
                            break;
                        case 2:
                            desencrip = desencriptado(mensaje, clave);
                            System.out.println("Usando la fuerza, pudo abrir el holocron y desencriptar el mensaje. Su mensaje desencriptado es: "+desencrip);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    System.out.println("Disenio de Tie Fighter");
                    int num = 0;
                    System.out.println("Ingrese dimensiones del nuevo tie fighter (Numero impar mayor o igual a 5)");
                    num = entry.nextInt();
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

    public static String ejercicioencrip(String mensaje, String clave) {
        String resp = "";
        int posicion = 0;
        clave = clave.toLowerCase();
        for (int i = 0; i < clave.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isDigit(caracter)) {
                char lectura = clave.charAt(posicion % clave.length());
                int desicion = lectura - 'a';
                char base;
                if (Character.isUpperCase(caracter)) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                int pos = caracter - base;

                if (pos % 2 == 0) {
                    pos = pos - desicion;
                } else {
                    pos = pos + desicion;
                }
                pos = (pos + 26) % 26;
                caracter = (char) (base + pos);
                pos++;
            }
            resp += caracter;
        }
        return resp;
    }

    public static String desencriptado(String mensaje, String clave) {
        String resp = "";
        int posicion = 0;
        clave = clave.toLowerCase();
        for (int i = 0; i < clave.length(); i++) {
            char caracter = mensaje.charAt(i);
            if (Character.isDigit(caracter)) {
                char lectura = clave.charAt(posicion % clave.length());
                int desicion = lectura - 'a';
                char base;
                if (Character.isUpperCase(caracter)) {
                    base = 'A';
                } else {
                    base = 'a';
                }
                int pos = caracter - base;

                if (pos % 2 == 0) {
                    pos = pos + desicion;
                } else {
                    pos = pos - desicion;
                }
                pos = (pos + 26) % 26;
                caracter = (char) (base + pos);
                pos++;
            }
            resp += caracter;
        }
        return resp;
    }

    /*public static void ImprimirTieFighter(int n) {

    }*/
}
