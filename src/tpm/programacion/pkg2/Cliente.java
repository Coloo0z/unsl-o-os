/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm.programacion.pkg2;
import java.lang.Comparable;

/**
 *
 * @author guill
 */
public class Cliente implements Comparable<Cliente>{
    private String nombre;
    private String CUIT;
    private String telefono;
    
    public Cliente(){}
    public Cliente(String nombre, String cuit, String telefono){
        this.nombre = nombre;
        this.CUIT = cuit;
        this.telefono = telefono;
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
     * @return the CUIT
     */
    public String getCUIT() {
        return CUIT;
    }

    /**
     * @param CUIT the CUIT to set
     */
    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public int compareTo(Cliente cliente){
        return this.nombre.compareTo(cliente.nombre);
    }
    
    
    
}
