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
import proyectofinal.accesoADatos.PropiedadInmuebleData;
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
      //   InquilinoData inD = new InquilinoData();
//         inD.AgregarInquilino(in);
        
//         Inquilino in = new Inquilino("Ifran", "Florencia", 87654321, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
//        InquilinoData inD = new InquilinoData();
//         inD.AgregarInquilino(in);

//         inD.BajaInquilino(3);
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
    // PropietarioData pd = new PropietarioData ();
//    pd.BajaPropietario(0);
     
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



//
//for(ContratoAlquiler in:caD.obtenerContratosdeBaja()){
//        
//        System.out.println(in.getID_Contrato());
//        System.out.println(in.getMarca());
//        
//}





//        Propietario in = pd.BuscarPropietario(1);
//          if(in!=null){
//        System.out.println("dni "+ in.getDni());
//        System.out.println("apellido "+ in.getApelidoPropietario());}
        

    //ContratoAlquilerData
    //ContratoAlquilerData caD = new ContratoAlquilerData(); 
       Inquilino inq = new Inquilino(1,"Ifran", "Florencia", 87654321, 124567890, "Buen Inquilino, paga el alquiler a tiempo", "Dink", true);
////         
        Propietario prop = new Propietario (1,"Jimenez", "juansito", 12345678, "Lasheras", 123456, true);
        PropietarioData pd = new PropietarioData ();
//
        PropiedadInmueble mi = new PropiedadInmueble(3,"Buena","Bien ubicado","Lamarca 123",prop,true,"Buena",1,inq,2300.0f,200,"Local","Urbano");
        PropiedadInmuebleData piD= new PropiedadInmuebleData();
//         
//        
        ContratoAlquiler ca= new ContratoAlquiler(5,inq, LocalDate.of(2028,8,23),LocalDate.of(2021,8,12),LocalDate.of(2013,10,10),'B',mi,"Alberto",true);
        ContratoAlquilerData caD= new ContratoAlquilerData(); 
        caD.crearContrato(ca); 
//        
//        Inquilino inquilino = new Inquilino(2,"Leiva Cheik Ali","Carlos", 87654324,"paga el alquiler a tiempo","Estudiante ", true);
//        
//        ContratoAlquiler ca2= new ContratoAlquiler(4,inquilino, LocalDate.of(2100,8,8),LocalDate.of(2021,8,8),LocalDate.of(2022,8,8),'N',mi,"Josefina",true);       
//        //caD.renovacion(ca2); 
        
//        ContratoAlquiler contrato = caD.buscarContrato(1);
//            if (contrato != null) {
//            
//             System.out.println("Inquilino: "+contrato.getInquilino());
//             System.out.println("Fecha Final: "+contrato.getFecha_Final());
//             System.out.println("Fecha Inicio: "+contrato.getFecha_Inicio());
//             System.out.println("Fecha Realizacion: "+contrato.getFecha_Realizacion());
//             System.out.println("Marca: "+contrato.getMarca());
//             System.out.println("Propiedad: "+contrato.getPropiedad());
//             System.out.println("Vendedor: "+contrato.getVendedor());
//             
//            
//            } 
         
         //caD.cancelacion(1); 
         
//         PropiedadInmuebleData piD= new PropiedadInmuebleData();
// for(PropiedadInmueble prop:piD.obtenerLasPropiedades()){
//        
//        System.out.println(prop.getID_Local());
//        System.out.println(prop.getAccesibilidad());
//        System.out.println(prop.getDuenio());
//        System.out.println(prop.getCaracteristicas()); 
//        
// }


        

//         PropietarioData propD= new PropietarioData();
//         Propietario Cari=propD.BuscarPropietario(1);
//         
//         //InquilinoData inD= new InquilinoData();
//         Inquilino Ifran=inD.BuscarInquilino(1);
//         
//         PropiedadInmuebleData propInD = new PropiedadInmuebleData();
//         PropiedadInmueble propIn = new PropiedadInmueble("Accesible para discapacitados", "habitaciones,baño,garage,pileta","Belgrano 1002",Cari,true,"Rectangular",Ifran,1450000,30,"Residencial", "Suburbio residencial");
//         
        // propInD.AgregarPropiedadInmueble(propIn);
//        
       
//    Propietario prop = new Propietario(1,"C", "Francisco", 1304613, "av.Cabral", 34456780, true);
//    PropietarioData pd = new PropietarioData();
//////    pd.agregaPropietario(prop);
////pd.modificarPropietario(prop);
//pd.BajaPropietario(1);


      }
    }
    
    

