/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm.programacion.pkg2;

/**
 *
 * @author guill
 */
public class Comercio extends Cliente{
    private String nomComercio;
    private String direccion;
    private String CUITcomercio;
    private String telComercio;
    public Comercio(){
        super();
        nomComercio = null;
        direccion = null;
        CUITcomercio = null;
        telComercio = null;
    }

    public Comercio(String nomComercio, String direccion, String CUITcomercio, String telComercio, String nombre, String cuit, String telefono) {
        super(nombre, cuit, telefono);
        this.nomComercio = nomComercio;
        this.direccion = direccion;
        this.CUITcomercio = CUITcomercio;
        this.telComercio = telComercio;
    }
    /**
     * @return the nomComercio
     */
    public String getNomComercio() {
        return nomComercio;
    }

    /**
     * @param nomComercio the nomComercio to set
     */
    public void setNomComercio(String nomComercio) {
        this.nomComercio = nomComercio;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telComercio
     */
    public String getTelComercio() {
        return telComercio;
    }

    /**
     * @param telComercio the telComercio to set
     */
    public void setTelComercio(String telComercio) {
        this.telComercio = telComercio;
    }

    /**
     * @return the CUITcomercio
     */
    public String getCUITcomercio() {
        return CUITcomercio;
    }

    /**
     * @param CUITcomercio the CUITcomercio to set
     */
    public void setCUITcomercio(String CUITcomercio) {
        this.CUITcomercio = CUITcomercio;
    }
}
