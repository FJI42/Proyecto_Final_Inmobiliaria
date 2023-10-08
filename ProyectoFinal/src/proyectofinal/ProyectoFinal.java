/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import proyectofinal.Entidades.Inquilino;
import proyectofinal.accesoADatos.Conexion;
import proyectofinal.accesoADatos.InquilinoData;
import proyectofinal.accesoADatos.PropiedadInmuebleData;
import java.sql.*;
import java.time.LocalDate;
import java.time.Month;
import proyectofinal.Entidades.ContratoAlquiler;
import proyectofinal.Entidades.PropiedadInmueble;
import proyectofinal.Entidades.Propietario;
import proyectofinal.accesoADatos.ContratoAlquilerData;
import proyectofinal.accesoADatos.PropietarioData;

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
         
//     
//         Inquilino in = new Inquilino("Ifran", "Florencia", 87654321, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
         InquilinoData inD = new InquilinoData();
//         inD.AgregarInquilino(in);
        
//         Inquilino in = new Inquilino("Ifran", "Florencia", 87654321, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
//        InquilinoData inD = new InquilinoData();
//         inD.AgregarInquilino(in);

//         inD.BajaInquilino(4);
//         Inquilino in = inD.BuscarInquilino(1);
//          if(in!=null){
//        System.out.println("dni "+ in.getDNI());
//        System.out.println("apellido "+ in.getApellido());}

//        Inquilino in = inD.BuscarInquilino(1);
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
 //Inquilino inquilino = new Inquilino(1,"Leiva Cheik Ali","Carlos", 87654324,"paga el alquiler a tiempo","Estudiante ", true);
 //         inD.modificarInquilino(inquilino);
         


// Inquilino inquilino = new Inquilino(1,"Leiva Cheik Ali","Carlos", 87654321,"paga el alquiler a tiempo","Estudiante ", true);
//          inD.modificarInquilino(inquilino);

// Inquilino inquilino = new Inquilino(1,"Leiva Cheik Ali","Rodrigo", 12345678,"paga el alquiler a tiempo","Estudiante ", true);
//          inD.modificarInquilino(inquilino);



//     Propietario prop = new Propietario("Jimenez", "juansito", 12345678, "Lasheras", 123456, true);
//     PropietarioData pd = new PropietarioData ();
//     pd.agregaPropietario(prop);
//     

//     Propietario prop = new Propietario (1,"Jimenez", "juansito", 12345678, "Lasheras", 123456, true);
//     PropietarioData pd = new PropietarioData ();
////    pd.BajaPropietario(0);
     
//     for(Propietario in: pd.obtenerLosPropietarios()){
//        
//        System.out.println(in.getApelidoPropietario());
//        System.out.println(in.getNombrePropietario());
//        System.out.println(in.getDni());
//    }

//     for(Propietario in: pd.obtenerPropietariosdeBaja()){
//        
//        System.out.println(in.getApelidoPropietario());
//        System.out.println(in.getNombrePropietario());
//        System.out.println(in.getDni());
//    }


//        Propietario in = pd.BuscarPropietario(1);
//          if(in!=null){
//        System.out.println("dni "+ in.getDni());
//        System.out.println("apellido "+ in.getApelidoPropietario());}
        

    //crear contrato 
    
        Inquilino inq = new Inquilino(1,"Ifran", "Florencia", 87654324, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
//         
        Propietario prop = new Propietario (1,"Jimenez", "juansito", 12345678, "Lasheras", 123456, true);
        //PropietarioData pd = new PropietarioData ();

        PropiedadInmueble mi = new PropiedadInmueble(2,"Buena","Bien ubicado","Lamarca 123",prop,true,"Buena",4,inq,2300.0f,200,"Local","Urbano");
        //PropiedadInmuebleData piD= new PropiedadInmuebleData();
        //piD.AgregarPropiedadInmueble(mi); No me funiona en la BD(Flor)
        
        //ContratoAlquiler ca= new ContratoAlquiler(2,inq, LocalDate.of(2020,8,23),LocalDate.of(2021,8,12),LocalDate.of(2013,10,10),'B',mi,"Jose");
        ContratoAlquilerData caD= new ContratoAlquilerData(); 
        //caD.crearContrato(ca);  
//me da error "[ WARN] (main) Error: 1452-23000: Cannot add or update a child row: a foreign key constraint fails (`inmobiliaria_pf`.`contratoalquiler`, CONSTRAINT `c2` FOREIGN KEY (`Propiedad`) REFERENCES `propiedadinmueble` (`ID_Local`))"
        Inquilino inquilino = new Inquilino(2,"Leiva Cheik Ali","Carlos", 87654321,"paga el alquiler a tiempo","Estudiante ", true);
 
        ContratoAlquiler ca2= new ContratoAlquiler(1,inquilino, LocalDate.of(2028,8,8),LocalDate.of(2021,8,8),LocalDate.of(2022,8,8),'A',mi,"Jose");       
        caD.renovacion(ca2);
//se conecta bien pero no me devuelve nada ni modifica la base de datos        
        
        
        
// Hay que agregar mas cosas, esta todo conectado 
    
        
      }
    }
    
    

