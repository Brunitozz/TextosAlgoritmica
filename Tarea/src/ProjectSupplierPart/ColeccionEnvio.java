/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectSupplierPart;

/**
 *
 * @author user
 */
public class ColeccionEnvio {//Agregacion
    private Parte[] parte;
    private int id;

    public ColeccionEnvio(int parteLength) {
        this.id = 0;
        this.parte = new Parte[parteLength];
    }
    public boolean AgregarParte(int idProducto, String nombre) {
        int posicion = posicionParte(idProducto);
        if (posicion == 0) {
            if (id < parte.length) {
                id++;
                Parte temp = new Parte(nombre,idProducto);
                
                if (id == 1) {
                    parte[id - 1] = temp;
                    return true;
                } else {
                    int aux = id - 1;
                    while (aux > 0 && idProducto < parte[aux - 1].getIdProducto()) {
                        parte[aux] = parte[aux - 1];
                        aux--;
                    }
                    parte[aux] = temp;
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public int posicionParte(int idProducto) {
        int posicion = 0;
        int p = 0;
        while (p < id && posicion == 0) {
            if (idProducto == parte[p].getIdProducto()) {
                posicion = p + 1;
            } else if (idProducto < parte[p].getIdProducto()) {
                p = id;
            } else {
                p++;
            }
        }
        return posicion;
    }

    public boolean EliminarParte(int idProducto) {
        int posicion = posicionParte(idProducto);
        if (posicion != 0) {
            parte[posicion - 1] = null;
            for (int p = posicion - 1; p < id - 1; p++) {
                parte[p] = parte[p + 1];
            }
            parte[id - 1] = null;
            id--;
            return true;
        } else {
            return false;
        }
    }

    public Parte BuscarParte(int idProducto) {
        int p = 0;
        while (p < id) {
            if (idProducto == parte[p].getIdProducto()) {
                return parte[p];
            } else if (idProducto < parte[p].getIdProducto()) {
                p = id;
            } else {
                p++;
            }
        }
        return null;
    }

    public Parte MostrarParte(int idProducto) {
        int posicion = posicionParte(idProducto);
        if (posicion <= id) {
            return parte[posicion - 1];
        } else {
            return null;
        }
    }

    public void ListaParte() {
        for (int i = 0; i < id; i++) {
            if (parte[i] != null && !parte[i].getNombreProducto().isEmpty()) {
                System.out.println("Nombre: " + parte[i].getNombreProducto());
                System.out.println("ID Producto: " + parte[i].getIdProducto());
            }
        }
    }
}
