/*

 */

package boletin7_biblioteca;

import java.util.Scanner;

/**
 *
 * @author Lara Vazquez Dorna
 */
public class Boletin7_Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);

        //Inicializar objetos
       Libro libro= new Libro();

        //bandera
        System.out.println("Bienvenido al gestor de biblioteca.");

        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    //MOSTRAR DATOS DE UN LIBRO
                    libro.toString();
                    break;
                case 2:
                    //PRESTAR LIBRO
                    libro.prestamo();
                    break;
                case 3:
                    //DEVOLVER LIBRO
                    libro.devolucion();
                    break;
                
                case 0:
                    System.out.println("\n\t Gracias por usar el getor de biblioteca.");
                    break;
                default:
                    System.out.println("La operación elegida no existe.");
                    break;
            }
        } while (opcion != 0);

    }

    private static int menu() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nQue operación desea realizar:"
                + "\n1=> Mostrar datos de un libro."
                + "\n2=> Prestamo de libro"
                + "\n3=> Devulución de libro"
              
                + "\n0=>Salir");

        return Integer.parseInt(teclado.nextLine());
    }

        
    }


