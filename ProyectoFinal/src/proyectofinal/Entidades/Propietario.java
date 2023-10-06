/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.Entidades;

/**
 *
 * @author MCali
 */
public class Propietario {
    private int idPropietario;
    private String apelidoPropietario; 
    private String nombrePropietario;
    private int dni;
    private String domicilio;
    private int telefono;
    private boolean Estado;
 
    
    
    public Propietario() {
    }

    public Propietario(int idPropietario, String apelidoPropietario, String nombrePropietario, int dni, String domicilio, int telefono, boolean Estado) {
        this.idPropietario = idPropietario;
        this.apelidoPropietario = apelidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.Estado = Estado;
    }

    public Propietario(String apelidoPropietario, String nombrePropietario, int dni, String domicilio, int telefono, boolean Estado) {
        this.apelidoPropietario = apelidoPropietario;
        this.nombrePropietario = nombrePropietario;
        this.dni = dni;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.Estado = Estado;
    }

  
 
    
     public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
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
