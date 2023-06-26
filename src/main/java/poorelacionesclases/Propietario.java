package poorelacionesclases;

import java.util.List;

/**
 * POO - 2023-S1 26.06.2023 8.08
 * Clase: Propietario
 * @author Gabriel Eduardo Morejón López
 * 1 a 1
 * 1 a N
 * N a 1
 * N a N
 * @author Gabriel Eduardo Morejón López
 */
public class Propietario {
    private Long id;
    private String nombres;
    private String apellidos;
    
    // Relación 1 a N
    private List<Auto> listaAutos;

    public Propietario() {
    }

    public Propietario(Long id, String nombres, String apellidos, List<Auto> listaAutos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.listaAutos = listaAutos;
    }

    public List<Auto> getListAutos() {
        return listaAutos;
    }

    public void setListAutos(List<Auto> listaAutos) {
        this.listaAutos = listaAutos;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        //return "Propietario{" + "id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", listaAutos=" + listaAutos + '}';
        return nombres + " " + apellidos + " es propietario de: \n" + listaAutos;
    }
    
}
