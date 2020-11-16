/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;
    private String numeroReferencia;
    private int numeroPaginas;
    private int vecesPrestado;
    private boolean esLibroDeTexto;
    

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int paginasLibro, boolean libroDeTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = paginasLibro;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroDeTexto;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    } 
    
    public int getNumeroPaginas() {
        return numeroPaginas;
    } 
    
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    public String getDetalles() {
        String referenciaCorrecta = numeroReferencia;
        String libroTextoString = "";
        if (numeroReferencia.length() < 3) {
            referenciaCorrecta = "ZZZ";
        }
        if (!esLibroDeTexto) {
            libroTextoString = "no ";
        }   
        String detalles = ("Autor-> " + autor + " || Titulo-> " + titulo + " || Número de paginas-> " + numeroPaginas + " || Número de referencia-> " + referenciaCorrecta + " || El libro ha sido prestado " + vecesPrestado + " veces" + " || El libro " + libroTextoString + "es libro de texto"); 
        return detalles;
    }
    
    public int getVecesPrestado() {
        return vecesPrestado;
    }
    
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }
    
    public void setNumeroReferencia(String nuevaReferencia) {
        if (nuevaReferencia.length() >= 3) {
            numeroReferencia = nuevaReferencia;
        }
        else {
            System.out.println("ERROR: La referencia posee menos de 3 caracteres");
        }
    }
    
    public void prestar() {
        vecesPrestado++;
    }
    
    public void imprimeAutor() {
        System.out.println("El autor del libro es " + autor);
    }
    
    public void imprimeTitulo() {
        System.out.println("El titulo del libro es " + titulo);
    }
    
    public void imprimirDetalles() {
        System.out.println(getDetalles());
    }
}
