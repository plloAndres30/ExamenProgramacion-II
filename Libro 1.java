public class Libro {

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numeroEjemplares = 0;
        this.numeroEjemplaresPrestados = 0;
    }
    
    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
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
    
    public boolean prestamo() {
        if (numeroEjemplares > numeroEjemplaresPrestados) {
            numeroEjemplaresPrestados++;
            return true;
        }
        return false;
    }
    
    public boolean devolucion() {
        if (numeroEjemplaresPrestados > 0) {
            numeroEjemplaresPrestados--;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        int ejemplaresDisponibles = numeroEjemplares - numeroEjemplaresPrestados;
        return "Título: " + titulo + 
               "\nAutor: " + autor + 
               "\nEjemplares totales: " + numeroEjemplares + 
               "\nEjemplares prestados: " + numeroEjemplaresPrestados +
               "\nEjemplares disponibles: " + ejemplaresDisponibles;
    }
    
    public boolean hayDisponibilidad() {
        return numeroEjemplares > numeroEjemplaresPrestados;
    }
    
    public int getEjemplaresDisponibles() {
        return numeroEjemplares - numeroEjemplaresPrestados;
    }
}