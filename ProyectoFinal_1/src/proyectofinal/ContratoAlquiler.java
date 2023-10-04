package proyectofinal;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class ContratoAlquiler {
     
    private int codContrato; 
    private Inquilino elInquilino; 
    private LocalDate Fecha_Final; 
    private LocalDate Fecha_Inicio; 
    private LocalDate FechaRealizacion; 
    private char Marca;
    private PropiedadInmueble propiedad; 
    private String Vendedor;

    public ContratoAlquiler() {
    }

    public ContratoAlquiler(PropiedadInmueble propiedad) {
        this.propiedad = propiedad;
    }

    public ContratoAlquiler(char Marca) {
        this.Marca = Marca;
    }

    
    
    public ContratoAlquiler(int codContrato, Inquilino elInquilino, LocalDate Fecha_Final, LocalDate Fecha_Inicio, LocalDate FechaRealizacion, char Marca, String Vendedor) {
        this.codContrato = codContrato;
        this.elInquilino = elInquilino;
        this.Fecha_Final = Fecha_Final;
        this.Fecha_Inicio = Fecha_Inicio;
        this.FechaRealizacion = FechaRealizacion;
        this.Marca = Marca;
        this.Vendedor = Vendedor;
    }

    public char getMarca() {
        return Marca;
    }
    

    public PropiedadInmueble getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(PropiedadInmueble propiedad) {
        this.propiedad = propiedad;
    }

    
    public int getCodContrato() {
        return codContrato;
    }

    public void setCodContrato(int codContrato) {
        this.codContrato = codContrato;
    }

    public Inquilino getElInquilino() {
        return elInquilino;
    }

    public void setElInquilino(Inquilino elInquilino) {
        this.elInquilino = elInquilino;
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

    public LocalDate getFechaRealizacion() {
        return FechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate FechaRealizacion) {
        this.FechaRealizacion = FechaRealizacion;
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
    
    
    
    
}
