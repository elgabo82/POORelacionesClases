package poorelacionesclases;

/**
 * POO - 2023-S1 26.06.2023 8.07
 * Relaciones entre clases
 * Clase - Auto
 * @author Gabriel Eduardo Morejón López
 * 1 a 1
 * 1 a N
 * N a 1
 * N a N
 * @author Gabriel Eduardo Morejón López
 */
public class Auto {
    private long id;
    private String marca;
    private String modelo;
    private String placa;
    private int anioFabricacion;
    // Atributo que representa la relación
    // Objeto que representa el 1a1    
    private Propietario propietario;

    public Auto() {
    }

    public Auto(long id, String marca, String modelo, String placa, int anioFabricacion, Propietario propietario) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
        this.propietario = propietario;
    }    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }
    
    
    @Override
    public String toString() {
        //return "Auto{" + "id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario.getId() + '}';
        return "\nVehículo - Marca: " + marca + " - Modelo: " + modelo + 
                " - Placa: " + placa + 
                " Año Fab: " + anioFabricacion +
                " - ID Propietario: " + propietario.getId();
    }

    
}
