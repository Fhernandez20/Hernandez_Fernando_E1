/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernandoe1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fdhg0
 */
public class Hernandez_FernandoE1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            try {
                System.out.println("--------MENU--------");
                System.out.println("PIRAMIDE------1");
                System.out.println("EL MAYOR------2");
                System.out.println("CLIENTE-------3");
                System.out.println("CARACTERES VOCALES---4");
                System.out.println("SALIR---------5");
                System.out.println("--------------------");
                int opcion = lea.nextInt();

                if (opcion == 1) {
                    int filas = 0;
                    int numImprimir = 1;
                    int numinicial = 1;
                    int numerofila = 1;
                    int suma = 0;

                    try {
                        System.out.println("Ingrese la cantidad de filas que desea: ");
                        filas = lea.nextInt();

                        for (int contador = 1; contador <= filas; contador++) {
                            suma = 0;

                            for (numerofila = 1; numerofila <= contador; numerofila++) {
                                System.out.print(numImprimir + " ");
                                suma += numImprimir;
                                numImprimir += 2;
                            }
                            System.out.print("= " + suma);
                            System.out.println("");
                        }

                    } catch (InputMismatchException error) {
                        System.out.println("INGRESE UN CARACTER VALIDO");
                        lea.nextLine();
                    }
                }
                if (opcion == 2) {
                    int numeroEntero = 0;
                    int numeroMayor = 0;
                    double promedio = 0;
                    int cantNumIngresados = 0;
                    int suma = 0;
                    String usuarioSeguir = "SI";

                    while (usuarioSeguir.equals("SI")) {
                        try {
                            System.out.println("Ingrese numeros enteros: ");
                            numeroEntero = lea.nextInt();
                            cantNumIngresados++;
                            if (numeroEntero > numeroMayor) {
                                numeroMayor = numeroEntero;
                            }
                            suma += numeroEntero;
                            System.out.println("Quieres seguir? (SI/NO)");
                            usuarioSeguir = lea.next().toUpperCase();
                        } catch (InputMismatchException error) {
                            System.out.println("INGRESE UN CARACTER VALIDO");
                            lea.nextLine();
                        }
                    }
                    promedio = suma / cantNumIngresados;
                    System.out.println("el numero promedio es de: " + promedio + "");
                    System.out.println("el numero mayor que ingresaste: " + numeroMayor + "");
                }

                if (opcion == 3) {
                    String nombreCliente;
                    String seguir = "SI";
                    String tipoCanal;
                    int cantHD = 0, cantNORMAL = 0;
                    String cajaDigital = "";
                    int totalHD = 0, totalNORMAL = 0;
                    double subtotal = 0;
                    double ISV = 0;

                    System.out.println("Ingrese el nombre del cliente: ");
                    nombreCliente = lea.next();
                    do {
                        System.out.println("Que tipo de canal desea? (HD/NORMAL)");
                        tipoCanal = lea.next().toUpperCase();
                        if (tipoCanal.equals("HD")) {
                            cantHD++;
                        } else if (tipoCanal.equals("NORMAL")) {
                            cantNORMAL++;
                        } else {
                            System.out.println("INGRESE UN CANAL VALIDO");
                        }
                        System.out.println("Quieres seguir? (SI/NO)");
                        seguir = lea.next().toUpperCase();

                    } while (seguir.equals("SI"));
                    while (true) {

                        System.out.println("Ingrese el tipo de Caja Digital deseada: (LIGHTBOX/HDBOX/DVRBOX)");
                        cajaDigital = lea.next().toUpperCase();
                        if (cajaDigital.equals("LIGHTBOX") || cajaDigital.equals("HDBOX") || cajaDigital.equals("DVRBOX")) {
                            System.out.println("FACTURA A NOMBRE DE: " + nombreCliente);
                            if (cantHD > 0) {
                                System.out.println("CANTIDAD DE CANAL HD: " + cantHD + "");
                                totalHD = cantHD * 30;
                                System.out.println("PRECIO DE CANAL HD: " + totalHD + " Lps");
                            }
                            if (cantNORMAL > 0) {
                                System.out.println("CANTIDAD DE CANAL NORMAL: " + cantNORMAL);
                                totalNORMAL = cantNORMAL * 20;
                                System.out.println("PRECIO DE CANAL NORMAL: " + totalNORMAL + " Lps");
                            }
                            if (cajaDigital.equals("LIGHTBOX")) {
                                System.out.println("EL PRECIO POR UNA LIGHT BOX: 50 Lps ");
                                subtotal = totalNORMAL + totalHD + 50;
                                ISV = 0.15 * subtotal;
                                subtotal = subtotal + ISV;
                                System.out.println("EL IMPUESTO ES DE " + ISV + " Lps");
                                System.out.println("TU TOTAL ES DE: " + subtotal + "");
                                break;
                            }
                            if (cajaDigital.equals("HDBOX")) {
                                System.out.println("EL PRECIO POR UNA HDBOX: 100 Lps ");
                                subtotal = totalNORMAL + totalHD + 100;
                                ISV = 0.15 * subtotal;
                                subtotal = subtotal + ISV;
                                System.out.println("EL IMPUESTO ES DE " + ISV + " Lps");
                                System.out.println("TU TOTAL ES DE: " + subtotal + "");
                                break;
                            }
                            if (cajaDigital.equals("DVRBOX")) {
                                System.out.println("EL PRECIO POR DVRBOX: 150 Lps ");
                                subtotal = totalNORMAL + totalHD + 150;
                                ISV = 0.15 * subtotal;
                                subtotal = subtotal + ISV;
                                System.out.println("EL IMPUESTO ES DE " + ISV + " Lps");
                                System.out.println("TU TOTAL ES DE: " + subtotal + "");
                                break;
                            }

                        } else {
                            System.out.println("INGRESE UNA CAJA DIGITAL VALIDA!!");
                        }
                    }
                }
                if (opcion == 4) {
                    while (true) {
                        int vocales = 0;
                        String cadena;
                        char letraActual;

                        System.out.println("Ingrese una cadena de palabras: ");
                        cadena = lea.next().toLowerCase();

                        for (int contador = 0; cadena.length() > contador; contador++) {
                            letraActual = cadena.charAt(contador);

                            switch (letraActual) {

                                case 'a':
                                case 'e':
                                case 'i':
                                case 'o':
                                case 'u':
                                    vocales++;
                                default:
                            }
                        }
                        System.out.println("la cantidad de vocales en tu cadena es de: " + vocales + "");
                        break;
                    }
                }
                if (opcion == 5) {
                    System.out.println("HASTA LUEGO :D");
                    System.exit(0);
                }
            } catch (InputMismatchException error) {
                System.out.println("INGRESE UN CARACTER VALIDO");
                lea.nextLine();
            }
        }
    }
}
