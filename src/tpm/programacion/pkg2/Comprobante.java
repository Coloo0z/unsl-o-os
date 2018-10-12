/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpm.programacion.pkg2;
import java.time.LocalDate;
/**
 *
 * @author guill
 */
public class Comprobante {
    private LocalDate fecha;
    private char tipo;
    private String numero;
    private int codigoDocumentoCliente;
    private String documentoCliente;
    private float importeTotal;
    private int cantAlicuotas;
    private float importeTotalSinPNG;
    private float importeOE;
    private float importeIVA;
    private float otrosImpuestos;
    private float ingresosBrutos;
    private float impuestosMunicipales;
    private float impuestosInternos;
    private float otrosTributos;
    private String codigoMoneda;
    private float tipoCambio;
    private char codigoOperacion;

    public Comprobante(LocalDate fecha, char tipo, String numero, int codigoDocumentoCliente, String documentoCliente, float importeTotal, int cantAlicuotas, float importeTotalSinPNG, float importeOE, float importeIVA, float otrosImpuestos, float ingresosBrutos, float impuestosMunicipales, float impuestosInternos, float otrosTributos, String codigoMoneda, float tipoCambio, char codigoOperacion) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.numero = numero;
        this.codigoDocumentoCliente = codigoDocumentoCliente;
        this.documentoCliente = documentoCliente;
        this.importeTotal = importeTotal;
        this.cantAlicuotas = cantAlicuotas;
        this.importeTotalSinPNG = importeTotalSinPNG;
        this.importeOE = importeOE;
        this.importeIVA = importeIVA;
        this.otrosImpuestos = otrosImpuestos;
        this.ingresosBrutos = ingresosBrutos;
        this.impuestosMunicipales = impuestosMunicipales;
        this.impuestosInternos = impuestosInternos;
        this.otrosTributos = otrosTributos;
        this.codigoMoneda = codigoMoneda;
        this.tipoCambio = tipoCambio;
        this.codigoOperacion = codigoOperacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigoDocumentoCliente() {
        return codigoDocumentoCliente;
    }

    public void setCodigoDocumentoCliente(int codigoDocumentoCliente) {
        this.codigoDocumentoCliente = codigoDocumentoCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public float getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(float importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getCantAlicuotas() {
        return cantAlicuotas;
    }

    public void setCantAlicuotas(int cantAlicuotas) {
        this.cantAlicuotas = cantAlicuotas;
    }

    public float getImporteTotalSinPNG() {
        return importeTotalSinPNG;
    }

    public void setImporteTotalSinPNG(float importeTotalSinPNG) {
        this.importeTotalSinPNG = importeTotalSinPNG;
    }

    public float getImporteOE() {
        return importeOE;
    }

    public void setImporteOE(float importeOE) {
        this.importeOE = importeOE;
    }

    public float getImporteIVA() {
        return importeIVA;
    }

    public void setImporteIVA(float importeIVA) {
        this.importeIVA = importeIVA;
    }

    public float getOtrosImpuestos() {
        return otrosImpuestos;
    }

    public void setOtrosImpuestos(float otrosImpuestos) {
        this.otrosImpuestos = otrosImpuestos;
    }

    public float getIngresosBrutos() {
        return ingresosBrutos;
    }

    public void setIngresosBrutos(float ingresosBrutos) {
        this.ingresosBrutos = ingresosBrutos;
    }

    public float getImpuestosMunicipales() {
        return impuestosMunicipales;
    }

    public void setImpuestosMunicipales(float impuestosMunicipales) {
        this.impuestosMunicipales = impuestosMunicipales;
    }

    public float getImpuestosInternos() {
        return impuestosInternos;
    }

    public void setImpuestosInternos(float impuestosInternos) {
        this.impuestosInternos = impuestosInternos;
    }

    public float getOtrosTributos() {
        return otrosTributos;
    }

    public void setOtrosTributos(float otrosTributos) {
        this.otrosTributos = otrosTributos;
    }

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    public float getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(float tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public char getCodigoOperacion() {
        return codigoOperacion;
    }

    public void setCodigoOperacion(char codigoOperacion) {
        this.codigoOperacion = codigoOperacion;
    }
    
    
    
}
