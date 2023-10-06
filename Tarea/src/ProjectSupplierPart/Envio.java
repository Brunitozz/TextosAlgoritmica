/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectSupplierPart;

/**
 *
 * @author user
 */
public class Envio {
    private Proveedor proveedor;
    private int cantidad;
    private Parte parte;

    public Envio(String nombre, int idProveedor, int numero_cel ,
            String clasificacion, String nombreProducto, int idProducto,int cantidad) {
        this.cantidad = cantidad;
        this.proveedor = new Proveedor (nombre, idProveedor, numero_cel);
        this.parte = new Parte (nombreProducto, idProducto);
    }

    /**
     * @return the proveedor
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * @param proveedor the proveedor to set
     */
    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the parte
     */
    public Parte getParte() {
        return parte;
    }

    /**
     * @param parte the parte to set
     */
    public void setParte(Parte parte) {
        this.parte = parte;
    }
    
    
}
