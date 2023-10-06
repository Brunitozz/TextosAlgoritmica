/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectSupplierPart;

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ColeccionEnvio coleccion = new ColeccionEnvio(10);
        coleccion.AgregarParte(1, "Ace");
        coleccion.AgregarParte(3, "Bimbo");
        coleccion.AgregarParte(2, "Alcachofa");
        coleccion.ListaParte();
    }
    
}
