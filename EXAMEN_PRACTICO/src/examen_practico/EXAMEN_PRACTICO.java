/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_practico;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EXAMEN_PRACTICO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int piedra = 1;
        int tijera = 2;
        int papel = 3;
        boolean jugar;
        String piedraPapelTijera;
        captu.hasNextLine();
        piedra = captu.nextInt();
        System.out.println();
        papel = captu.nextInt();
        System.out.println();
        tijera = captu.nextInt();
        System.out.println();
        jugar = captu.nextBoolean();
        System.out.println();
        
        while(jugar){
            System.out.println("1. piedra");
            System.out.println("2. papel");
            System.out.println("3. tijera");
            
            
        }
      
       
    }
    
}
