/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p5;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion
        int n;
        //Procedimiento
        n = pedir();
        mostrar (n);
    }
    public static int pedir (){
        int n;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Numero Primo   *****");
        System.out.println("Introduce el numero");
        n = teclado.nextInt();
        return n;
    }
    public static void mostrar (int n){
        int r;
        int v;
        v = n - 1;
        //Se evalua si el numero es primo, dependiendo de, el mensaje que se muestra
        while (v > 1){
            r = n % v;
            if (r == 0){
                System.out.println("El numero no es primo");
                System.exit(0);
            }
            v--;
        }
        System.out.println("El numero es primo");
    }
    
}
