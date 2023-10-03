package proyectofinal;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Inquilino {
    private String Apellido; 
    private String Detalle;
    private int DNI;
    private int Id_Inquilino; 
    private String Nombre; 
    private ArrayList <PropiedadInmueble> propiedades;  
    private String Tipo; 
    private boolean Estado;
 
    public Inquilino() {
    }

    public Inquilino(String Apellido, String Detalle, int DNI, String Nombre) {
        this.Apellido = Apellido;
        this.Detalle = Detalle;
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    public Inquilino(int Id_Inquilino, String Tipo) {
        this.Id_Inquilino = Id_Inquilino;
        this.Tipo = Tipo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getId_Inquilino() {
        return Id_Inquilino;
    }

    public void setId_Inquilino(int Id_Inquilino) {
        this.Id_Inquilino = Id_Inquilino;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

   
    
    
    
    
}
