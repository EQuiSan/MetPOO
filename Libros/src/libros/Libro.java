
package libros;

public class Libro {
    String Id;
    String nombre;
    String autor;
    String descripcion;
    double precio;

    @Override
    public String toString() {
        return "ID=" + Id + ", Nombre=" + nombre + ", Autor=" + autor + ", Descripcion=" + descripcion + ", Precio:" + precio + '}'+"\n";
        
    }

    public Libro(String Id, String nombre, String autor, String descripcion, double precio) {
        this.Id = Id;
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    
    
    public String getId() {
        return Id;
    }
    public void setId(String Id) {
        this.Id = Id;
    }

    
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
