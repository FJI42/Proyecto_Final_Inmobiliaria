package proyectofinal.Entidades;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Inquilino {
    private int Id_Inquilino;
    private String Apellido; 
    private String Nombre;
    private int DNI;
    private long CUIL;
    private String Detalle;
    private String Tipo; 
    private boolean Estado; 
    private ArrayList <PropiedadInmueble> propiedades;  

    public Inquilino() {
    }

    public Inquilino(int Id_Inquilino, String Apellido, String Nombre, int DNI, long CUIL, String Detalle, String Tipo, boolean Estado) {
        this.Id_Inquilino = Id_Inquilino;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.Detalle = Detalle;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }

    public Inquilino(String Apellido, String Nombre, int DNI, long CUIL, String Detalle, String Tipo, boolean Estado) {
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.Detalle = Detalle;
        this.Tipo = Tipo;
        this.Estado = Estado;
    }

    public Inquilino(int Id_Inquilino, String Apellido, String Nombre, int DNI, long CUIL, String Detalle, String Tipo) {
        this.Id_Inquilino = Id_Inquilino;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.DNI = DNI;
        this.CUIL = CUIL;
        this.Detalle = Detalle;
        this.Tipo = Tipo;
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

    public long getCUIL() {
        return CUIL;
    }

    public void setCUIL(long CUIL) {
        this.CUIL = CUIL;
    }

    

    
    @Override
    public String toString() {
        return Id_Inquilino+", " + Apellido+ ", " + Nombre+ ", " + DNI+ ", "+ CUIL+ ", " + Detalle+ ", " + Tipo+ ", " + Estado+", " + propiedades+", ";
    }

   
    
    
    
    
}
