/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProductosService {
    
    Scanner lr;
    HashMap<String, Productos> productos;

    public ProductosService() {
        this.lr = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
    }
    
    private Productos crearProductos() {
        System.out.println("ingrese el nombre del producto");
        String nom = lr.next();
        System.out.println("ingrese el precio");
        Double pre = lr.nextDouble();
        Productos pro = new Productos(nom,pre);
        return pro;
    }
    
    private String addProdu() {
        Productos pro = crearProductos();
        
        productos.put(pro.getNombre(), pro);
        
        String men = "el producto se añadio";
        
        return men;
    }
    
    private String editProdu(String k) {
        if (productos.containsKey(k)) {
            Productos pro = productos.get(k);
            System.out.println("nombre: "+pro.getNombre());
            System.out.println("------------{}------------");
            System.out.println("precio:"+pro.getPrecio());
            System.out.println("------------{}------------");
            System.out.println("ingrese el nuevo precio");
            Double prenu = lr.nextDouble();
            pro.setPrecio(prenu);
            System.out.println("el nuevo precio es "+prenu);
            System.out.println("esta seguro que quiere guardar los cambios");
            System.out.println("SI/NO");
            String l = lr.next();
            while (!l.equalsIgnoreCase("si")&&!l.equalsIgnoreCase("no")) {                
               System.out.println("SI/NO");
               l = lr.next(); 
            }
            if (l.equalsIgnoreCase("si")) {
                productos.replace(k, pro);
                String men = "el producto se actualizo";
                return men;
            }else {
                System.out.println("quiere volver a intentar");
                System.out.println("SI/NO");
                l = lr.next();
                while (!l.equalsIgnoreCase("si")&&!l.equalsIgnoreCase("no")) {                
                   System.out.println("SI/NO");
                   l = lr.next(); 
                }
                if (l.equalsIgnoreCase("si")) {
                    editProdu(k);
                }else {
                    String men = "se canselo la edicion";
                    return men;
                }
            }
        }else {
            String men = "el producto no existe";
            return men;
        }
        return null;
    }
    
    private String elimiProdu(String k) {
        if (productos.containsKey(k)) {
            Productos pro = productos.get(k);
            System.out.println("esta seguro que quiere eliminar el:");
            System.out.println(pro.getNombre()+" - "+pro.getPrecio());
            System.out.println("SI/NO");
            String l = lr.next();
            while (!l.equalsIgnoreCase("si")&&!l.equalsIgnoreCase("no")) {                
               System.out.println("SI/NO");
               l = lr.next(); 
            }
            if (l.equalsIgnoreCase("si")) {
                productos.remove(k);
                String men = "el producto se elimino";
                return men;
            }else {
                String men = "el producto no se elimino";
                return men;
            }
        }else {
            String men = "el producto no se encontro";
            return men;
        }
    }

    private void mostraProdu() {
        System.out.println("----------{}----------");
        System.out.println("nombre  /  precio");
        productos.entrySet().forEach((aux) -> {
            String key = aux.getKey();
            Productos value = aux.getValue();
            System.out.println(key+" / $"+value.getPrecio());
        });
        System.out.println("----------{}----------");
    }
    
    public void menuProdu() {
        int k;
        String pat;
        String mensa = "";
        do {
            System.out.println(mensa);
            System.out.println("-------------{}-------------");
            System.out.println("1 - agregar nuevo producto");
            System.out.println("2 - editar precio");
            System.out.println("3 - eliminar producto");
            System.out.println("4 - mostrar productos");
            System.out.println("5 - cerrar menu");
            k = lr.nextInt();
            System.out.println("-------------{}-------------");
            switch(k){
                case 1:
                    mensa = "mensaje: "+addProdu();
                    break;
                case 2:
                    System.out.println("ingrese el nombre del producto");
                    pat = lr.next();
                    mensa = "mensaje: "+editProdu(pat);
                    break;
                case 3:
                    System.out.println("ingrese el nombre del producto");
                    pat = lr.next();
                    mensa = "mensaje: "+elimiProdu(pat);
                    break;
                case 4:
                    mostraProdu();
                    mensa = "";
                    break;
                case 5:
                    System.out.println("cerrando el menu");
                    break;
                default:
                    pat = k+" no es una opcion valida";
                    mensa = "mensaje: "+pat;
            }
        } while (k != 5);
    }
}
