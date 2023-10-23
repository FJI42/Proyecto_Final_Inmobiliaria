/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal.Entidades;

/**
 *
 * @author User
 */
public class Garante {
    private int ID_Garante;
    private String Apellido;
    private String Nombre;
    private int DNI;
    private long CUIL;
    private String Detalle;
    private int Id_Inquilino;

    public Garante() {
    }

    public Garante(int ID_Garante, String Apellido, String Nombre, int DNI, long CUIL, String Detalle, int Id_Inquilino) {
        this.ID_Garante = ID_Garante;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.Detalle = Detalle;
        this.Id_Inquilino = Id_Inquilino;
    }

    public Garante(String Apellido, String Nombre, int DNI, long CUIL, String Detalle, int Id_Inquilino) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.Detalle = Detalle;
        this.Id_Inquilino = Id_Inquilino;
    }

    public int getID_Garante() {
        return ID_Garante;
    }

    public void setID_Garante(int ID_Garante) {
        this.ID_Garante = ID_Garante;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public long getCUIL() {
        return CUIL;
    }

    public void setCUIL(long CUIL) {
        this.CUIL = CUIL;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public int getId_Inquilino() {
        return Id_Inquilino;
    }

    public void setId_Inquilino(int Id_Inquilino) {
        this.Id_Inquilino = Id_Inquilino;
    }
    
}
