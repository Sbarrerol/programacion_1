package co.edu.uniquindio.biblioteca.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;
    private String inicioContrato;
    private String finContrato;

    public Empleado() {    }

    public Empleado(String nombre, String apellido, String cargo, String inicioContrato, String finContrato) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(String inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public String getFinContrato() {
        return finContrato;
    }

    public void setFinContrato(String finContrato) {
        this.finContrato = finContrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", inicioContrato='" + inicioContrato + '\'' +
                ", finContrato='" + finContrato + '\'' +
                '}';
    }
}
