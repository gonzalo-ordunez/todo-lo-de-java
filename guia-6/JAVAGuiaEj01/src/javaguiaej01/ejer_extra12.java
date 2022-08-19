/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

/**
 *
 * @author alumno
 */
public class ejer_extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 0;
        
        for (int i = 0; i < 999; i++) {
            System.out.println(coso((i/100))+"-"+coso((i/10)%10)+"-"+coso(i%10));
        }
    }
 
    public static String coso (int i){
        String m;
        
        if (i == 3) {
            m = "E";
        }else {
            m = String.valueOf(i);
        }
        
        return m;
    }
}
