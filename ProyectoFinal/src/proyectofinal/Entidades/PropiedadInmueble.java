/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal.Entidades;

/**
 *
 * @author MCali
 */




public class PropiedadInmueble {
    private int ID_Local; 
    private String accesibilidad ; 
    private String caracteristicas ; 
    private String direccion ;
    private Propietario duenio; 
    private boolean estadoLocal;
    private String forma; 
  //  private int idLocal; 
    private Inquilino ocupante; 
    private float precioTazado;
  //  private Inspector revisor;  
    private int superficieMinima;
    private String tipoLocal;
    private String zona;

    public PropiedadInmueble() {
    }


    public PropiedadInmueble(int ID_Local, String accesibilidad, String caracteristicas, String direccion, Propietario duenio, boolean estadoLocal, String forma, int idLocal, Inquilino ocupante, float precioTazado, int superficieMinima, String tipoLocal, String zona) {

        this.ID_Local = ID_Local;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.duenio = duenio;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
    //    this.idLocal = idLocal;
        this.ocupante = ocupante;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
    }

    public PropiedadInmueble(String accesibilidad, String caracteristicas, String direccion, Propietario duenio, boolean estadoLocal, String forma, Inquilino ocupante, float precioTazado, int superficieMinima, String tipoLocal, String zona) {
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.duenio = duenio;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
        this.ocupante = ocupante;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
    }

    public PropiedadInmueble(int ID_Local, String accesibilidad, String caracteristicas, String direccion, Propietario duenio, boolean estadoLocal, String forma, float precioTazado, int superficieMinima, String tipoLocal, String zona) {
        this.ID_Local = ID_Local;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.duenio = duenio;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
    }

    public PropiedadInmueble(String accesibilidad, String caracteristicas, String direccion, Propietario duenio, boolean estadoLocal, String forma, float precioTazado, int superficieMinima, String tipoLocal, String zona) {
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.duenio = duenio;
        this.estadoLocal = estadoLocal;
        this.forma = forma;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
    }
    public PropiedadInmueble(int ID_Local, String accesibilidad, String caracteristicas, String direccion, float precioTazado, int superficieMinima, String tipoLocal, String zona) {
        this.ID_Local = ID_Local;
        this.accesibilidad = accesibilidad;
        this.caracteristicas = caracteristicas;
        this.direccion = direccion;
        this.precioTazado = precioTazado;
        this.superficieMinima = superficieMinima;
        this.tipoLocal = tipoLocal;
        this.zona = zona;
    }
    
    
    
    public int getID_Local() {
        return ID_Local;
    }

    public void setID_Local(int ID_Local) {
        this.ID_Local = ID_Local;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
/*
    public int getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(int idLocal) {
        this.idLocal = idLocal;
    }
*/
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

    public String getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(String tipoLocal) {
        this.tipoLocal = tipoLocal;
    }

    public Propietario getDuenio() {
        return duenio;
    }

    public Inquilino getOcupante() {
        return ocupante;
    }

    public void setDuenio(Propietario duenio) {
        this.duenio = duenio;
    }

    public void setOcupante(Inquilino ocupante) {
        this.ocupante = ocupante;
    }

    @Override
    public String toString() {
        return ID_Local+", "+ accesibilidad+", " + caracteristicas+", " + direccion+", " + duenio+", " + estadoLocal+", " + forma+", " /*+ idLocal+", "*/ + ocupante+", " + precioTazado+", " + superficieMinima+", " + tipoLocal+", " + zona+", ";
    }


    
}
