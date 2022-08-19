/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author alumno
 */
public class Libro {
    
    private int ISBN;
    private String Título;
    private String Autor;
    private int Númerodepáginas;

    public Libro(int ISBN, String Título, String Autor, int Númerodepáginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Númerodepáginas = Númerodepáginas;
    }

    public Libro() {
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNúmerodepáginas() {
        return Númerodepáginas;
    }

    public void setNúmerodepáginas(int Númerodepáginas) {
        this.Númerodepáginas = Númerodepáginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", N\u00famerodep\u00e1ginas=" + Númerodepáginas + '}';
    }
    
    
    
    
}
