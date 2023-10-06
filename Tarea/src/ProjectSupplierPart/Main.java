/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectSupplierPart;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de articulos que desea agregar: ");
        int num_partes = sc.nextInt();
        ColeccionEnvio coleccion = new ColeccionEnvio(num_partes);
        System.out.println("Buenos dias, ingrese que accion desea realizar: ");
        do{
            System.out.println("(1) Agregar unas Partes \n(2) Eliminar Partes \n
        (3) Buscar una parte \n(4) Mostrar producto o parte \n(5) Mostrar toda la lista");
        }while();
        
        int op = sc.nextInt();
        switch(op){
            
        }
        
        /*coleccion.AgregarParte(1, "Ace");
        coleccion.AgregarParte(3, "Bimbo");
        coleccion.AgregarParte(2, "Alcachofa");
        coleccion.ListaParte();*/
    }
    
}
