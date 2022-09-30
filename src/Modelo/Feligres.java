package Modelo;

public class Feligres {

    private String cedula;
    private String estrato;
    private String nombre;
    private String direccion;
    private String telefono;
    private String estado;

    public Feligres() {
    }

    public Feligres(String cedula, String estrato, String nombre, String direccion, String telefono, String estado) {
        this.cedula = cedula;
        this.estrato = estrato;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEstrato() {
        return estrato;
    }

    public void setEstrato(String estrato) {
        this.estrato = estrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //metodo para calcular el valor del diezmo
    /*public void calcularValorDiezmo() {
        int valorDiezmo = 0;
        if (estrato == 1) {
            valorDiezmo = 250000;
        } else if (estrato == 2 || (estrato == 3)) {
            valorDiezmo = 500000;
        } else if (estrato > 3) {
            valorDiezmo = 1000000;
        }

        return valorDiezmo;
    }

    //metodo para saber si el feligres es un deudor o a cumplido con el diezmo
    public boolean mostrarEstado() {
        if (estado == true) {
            System.out.println("El feligres a cumplido");
        } else {
            System.out.println("el feligres es deudor");
        }
        return estado;

    }
*/

}
