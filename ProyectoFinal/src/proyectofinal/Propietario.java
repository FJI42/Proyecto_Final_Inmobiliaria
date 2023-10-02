/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author MCali
 */
public class Propietario {
    private String apelidoPropietario; 
    private int dni;
    private String domicilio;
    private int idPropietario;
    private String localesPropios;
    private String nombrePropietario;
    private int telefono;

    public Propietario() {
    }

    public Propietario(String apelidoPropietario, int dni, String domicilio, String localesPropios, String nombrePropietario, int telefono) {
        this.apelidoPropietario = apelidoPropietario;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localesPropios = localesPropios;
        this.nombrePropietario = nombrePropietario;
        this.telefono = telefono;
    }

    public Propietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getApelidoPropietario() {
        return apelidoPropietario;
    }

    public void setApelidoPropietario(String apelidoPropietario) {
        this.apelidoPropietario = apelidoPropietario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getLocalesPropios() {
        return localesPropios;
    }

    public void setLocalesPropios(String localesPropios) {
        this.localesPropios = localesPropios;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
