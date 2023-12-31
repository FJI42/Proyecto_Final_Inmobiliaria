/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

/**
 *
 * @author MCali
 */
public class PropiedadInmueble {
    private String accesibilidad ; 
    private String caracteristicas ; 
    private String dirección ;
    private Propietario dueño; 
    private boolean estadoLocal;
    private String forma; 
    private int idLocal; 
    private Inquilino ocupante; 
    private float precioTazado;
  //  private Inspector revisor;  
    private int superficieMinima;
    private boolean tipoLocal;
    private String zona;

    public PropiedadInmueble() {
    }

    public PropiedadInmueble(String accesibilidad, String caracteristicas, String dirección, String forma, int idLocal, float precioTazado, int superficieMinima, String zona) {
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.dirección = dirección;
        this.forma = forma;
        this.idLocal = idLocal;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.zona = zona;
    }

    public String getAccesibilidad() {
        return accesibilidad;
    }

    public void setAccesibilidad(String accesibilidad) {
        this.accesibilidad = accesibilidad;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }

    public float getPrecioTazado() {
        return precioTazado;
    }

    public void setPrecioTazado(float precioTazado) {
        this.precioTazado = precioTazado;
    }

    public int getSuperficieMinima() {
        return superficieMinima;
    }

    public void setSuperficieMinima(int superficieMinima) {
        this.superficieMinima = superficieMinima;
    }

    

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isEstadoLocal() {
        return estadoLocal;
    }

    public void setEstadoLocal(boolean estadoLocal) {
        this.estadoLocal = estadoLocal;
    }

    public boolean isTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(boolean tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

}
