public class Libro {
    // Atributos de la clase
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    
    // Constructor por defecto (libro vacío)
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }
    
    // Constructor con parámetros
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    
    // Métodos getter y setter
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
    
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }
    
    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }
    
    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }
    
    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }
    
    // Método préstamo - incrementa ejemplares prestados
    public boolean prestamo() {
        if (numeroEjemplares > numeroEjemplaresPrestados) {
            numeroEjemplaresPrestados++;
            return true; // Préstamo exitoso
        }
        return false; // No hay ejemplares disponibles
    }
    
    // Método devolución - decrementa ejemplares prestados
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true; // Devolución exitosa
        }
        return false; // No hay libros prestados para devolver
    }
    
    // Método toString para mostrar información del libro
    public String toString() {
        int ejemplaresDisponibles = numeroEjemplares - numeroEjemplaresPrestados;
        return "Título: " + titulo + 
               "\nAutor: " + autor + 
               "\nEjemplares totales: " + numeroEjemplares + 
               "\nEjemplares prestados: " + numeroEjemplaresPrestados +
               "\nEjemplares disponibles: " + ejemplaresDisponibles;
    }
    
    // Método adicional: verificar disponibilidad
    public boolean hayDisponibilidad() {
        return numeroEjemplares > numeroEjemplaresPrestados;
    }
    
    // Método adicional: obtener ejemplares disponibles
    public int getEjemplaresDisponibles() {
        return numeroEjemplares - numeroEjemplaresPrestados;
    }
}