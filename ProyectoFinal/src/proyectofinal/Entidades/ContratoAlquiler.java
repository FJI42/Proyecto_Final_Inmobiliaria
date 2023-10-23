package proyectofinal.Entidades;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class ContratoAlquiler {
     
    private int ID_Contrato; 
    private Inquilino Inquilino; 
    private LocalDate Fecha_Final; 
    private LocalDate Fecha_Inicio; 
    private LocalDate Fecha_Realizacion; 
    private char Marca;
    private PropiedadInmueble Propiedad; 
    private String Vendedor;
    private boolean Estado;

    public ContratoAlquiler() {
    }

    public ContratoAlquiler(Inquilino Inquilino, LocalDate Fecha_Final, LocalDate Fecha_Inicio, LocalDate Fecha_Realizacion, char Marca, PropiedadInmueble Propiedad, String Vendedor, boolean Estado) {
        this.Inquilino = Inquilino;
        this.Fecha_Final = Fecha_Final;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.Marca = Marca;
        this.Propiedad = Propiedad;
        this.Vendedor = Vendedor;
        this.Estado = Estado;
    }

    
    public ContratoAlquiler(int ID_Contrato, Inquilino Inquilino, LocalDate Fecha_Final, LocalDate Fecha_Inicio, LocalDate Fecha_Realizacion, char Marca, PropiedadInmueble Propiedad, String Vendedor, boolean Estado) {
        this.ID_Contrato = ID_Contrato;
        this.Inquilino = Inquilino;
        this.Fecha_Final = Fecha_Final;
        this.Fecha_Inicio = Fecha_Inicio;
        this.Fecha_Realizacion = Fecha_Realizacion;
        this.Marca = Marca;
        this.Propiedad = Propiedad;
        this.Vendedor = Vendedor;
        this.Estado = Estado;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    
    
    
    public ContratoAlquiler(PropiedadInmueble Propiedad) {
        this.Propiedad = Propiedad;
    }

    public ContratoAlquiler(char Marca) {
        this.Marca = Marca;
    }
    
    

    
    public char getMarca() {
        return Marca;
    }
    

    public PropiedadInmueble getPropiedad() {
        return Propiedad;
    }

    public void setPropiedad(PropiedadInmueble Propiedad) {
        this.Propiedad = Propiedad;
    }

    
    public int getID_Contrato() {
        return ID_Contrato;
    }

    public void setID_Contrato(int ID_Contrato) {
        this.ID_Contrato = ID_Contrato;
    }

    public Inquilino getInquilino() {
        return Inquilino;
    }

    public void setInquilino(Inquilino Inquilino) {
        this.Inquilino = Inquilino;
    }

    public LocalDate getFecha_Final() {
        return Fecha_Final;
    }

    public void setFecha_Final(LocalDate Fecha_Final) {
        this.Fecha_Final = Fecha_Final;
    }

    public LocalDate getFecha_Inicio() {
        return Fecha_Inicio;
    }

    public void setFecha_Inicio(LocalDate Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    public LocalDate getFecha_Realizacion() {
        return Fecha_Realizacion;
    }

    public void setFecha_Realizacion(LocalDate Fecha_Realizacion) {
        this.Fecha_Realizacion = Fecha_Realizacion;
    }

    public char isMarca() {
        return Marca;
    }

    public void setMarca(char Marca) {
        this.Marca = Marca;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    @Override
    public String toString() {
        return "" + ID_Contrato + Inquilino+ Fecha_Final + Fecha_Inicio  + Fecha_Realizacion + Marca+ Propiedad + Vendedor+ Estado ;
    }

    
    
    
    
}
