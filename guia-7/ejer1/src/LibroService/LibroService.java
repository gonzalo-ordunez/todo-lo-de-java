/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroService;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class LibroService {
    
    public Libro Patata(){
        
        Libro l1 = new Libro();
        
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("inrese el ISBN del libro");
        l1.setISBN(lr.nextInt());
        System.out.println("ingrese el Titulo del libro");
        l1.setTítulo(lr.next());
        System.out.println("ingrese el nombre del autor");
        l1.setAutor(lr.next());
        System.out.println("ingrese el numero de Paginas");
        l1.setNúmerodepáginas(lr.nextInt());
        return l1;
    }
    
    public void Soda(Libro l1) {
        System.out.println(l1);
    }
    
}
