package poorelacionesclases;

import java.util.ArrayList;
import java.util.List;

/**
 * POO - 2023-S1 26.06.2023 8.05
 * Relaciones entre clases
 * @author Gabriel Eduardo Morejón López
 * 1 a 1
 * 1 a N
 * N a 1
 * N a N
 */
public class POORelacionesClases {

    public static void main(String[] args) {
        System.out.println("Ejercicio de relaciones");
        
        Auto a1 = new Auto();
        a1.setId(1);
        a1.setMarca("Ford");
        a1.setModelo("F150");
        a1.setAnioFabricacion(2018);
        a1.setPlaca("MBA2010");
        Auto a2 = new Auto();
        a2.setId(2);
        a2.setMarca("Kia");
        a2.setModelo("Sportage");
        a2.setAnioFabricacion(2012);
        a2.setPlaca("MBA4933");
        
        Auto a3 = new Auto();
        a3.setId(3);
        a3.setMarca("KIA");
        a3.setModelo("Sportage Classic");
        a3.setAnioFabricacion(2005);
        a3.setPlaca("MCV313");
        Propietario p1 = new Propietario();
        p1.setId(1L);
        p1.setApellidos("Morejón López");
        p1.setNombres("Gabriel");
        
        a3.setPropietario(p1);
        
        Propietario p2 = new Propietario();
        p2.setId(2L);
        p2.setApellidos("Morejón Obregón");
        p2.setNombres("Gabriel");
        
        List<Auto> la1 = new ArrayList<>();
        List<Auto> la2 = new ArrayList<>();
                
        a1.setPropietario(p2);
        a2.setPropietario(p2);
        
        
        la1.add(a1);
        la1.add(a2);
        la2.add(a3);
        p1.setListAutos(la2);
        
        p2.setListAutos(la1);
        
        
        //System.out.println(p2.getApellidos() + " " + p2.getNombres() + " tiene:" + p2.getListAutos().toString());
        
        System.out.println("Propietario 1: " + p1);
        System.out.println("Propietario 2: " + p2);        
        
    }
}
