/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import proyectofinal.Entidades.Inquilino;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.InquilinoData;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import proyectofinal.Entidades.ContratoAlquiler;
import proyectofinal.Entidades.PropiedadInmueble;
import proyectofinal.Entidades.Propietario;
import proyectofinal.accesoADatos.ContratoAlquilerData;

/**
 *
 * @author usuario
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Connection con = Conexion.getConexion();
         
         Inquilino in = new Inquilino("Ifran", "Florencia", 87654321, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
         InquilinoData inD = new InquilinoData();
//         inD.AgregarInquilino(in);
//         inD.BajaInquilino(4);
//         Inquilino in = inD.BuscarInquilino(1);
//          if(in!=null){
//        System.out.println("dni "+ in.getDNI());
//        System.out.println("apellido "+ in.getApellido());}
//        for(Inquilino in:inD.obtenerInquilinosdeBaja()){
//        
//        System.out.println(in.getDNI());
//        System.out.println(in.getApellido());
//        System.out.println(in.getNombre());
//        System.out.println(in.getTipo());
//        
//      }
//    
//for(Inquilino in:inD.obtenerLosInquilinos()){
//        
//        System.out.println(in.getDNI());
//        System.out.println(in.getApellido());
//        System.out.println(in.getNombre());
//        System.out.println(in.getTipo());
//}
// Inquilino inquilino = new Inquilino(7,"Leiva Cheik Ali","Carlos", 87654324,"paga el alquiler a tiempo","Estudiante ", true);
//          inD.modificarInquilino(inquilino);


     
     // PropiedadInmueble mi = new PropiedadInmueble("Buena","Bien ubicado","Lamarca 123",);
      
          
//    ContratoAlquiler ca= new ContratoAlquiler(4,in, LocalDate.of(2020,8,23),LocalDate.of(2021,8,12),LocalDate.of(2013,10,10),'D',"Depa");
//    ContratoAlquilerData caD= new ContratoAlquilerData(); 
//    caD.crearContrato(ca);

//Hay que agregar mas cosas, esta todo conectado 

     }
    }
    

