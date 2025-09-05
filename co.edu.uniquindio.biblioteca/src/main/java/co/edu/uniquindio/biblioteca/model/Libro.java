package co.edu.uniquindio.biblioteca.model;

public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int codigo;
    private int cantidad;

    public Libro() {    }

    public Libro(String titulo, String autor, String editorial, int codigo, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", codigo=" + codigo +
                ", cantidad=" + cantidad +
                '}';
    }
}

