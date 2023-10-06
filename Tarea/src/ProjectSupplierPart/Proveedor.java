/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectSupplierPart;

/**
 *
 * @author user
 */
public class Proveedor {
    private String nombre;
    private int idProveedor;
    private int numero_cel;

    public Proveedor(String nombre, int idProveedor, int numero_cel){
        this.nombre = nombre;
        this.idProveedor = idProveedor;
        this.numero_cel = numero_cel;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the idProveedor
     */
    public int getIdProveedor() {
        return idProveedor;
    }

    /**
     * @param idProveedor the idProveedor to set
     */
    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    /**
     * @return the numero_cel
     */
    public int getNumero_cel() {
        return numero_cel;
    }

    /**
     * @param numero_cel the numero_cel to set
     */
    public void setNumero_cel(int numero_cel) {
        this.numero_cel = numero_cel;
    }
    
}
