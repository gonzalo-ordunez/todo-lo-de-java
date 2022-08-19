
package javaguiaej01;


public class ejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] v = new int[10][10];
        int[][] w = new int[3][3];
        int n = 0;
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                v[i][j] = (int) (Math.random() * 10);
            }
        }
        int nume = (int) (Math.random() * 8);
        int num = (int) (Math.random() * 8);
        for (int i = nume; i < nume+3; i++) {
            for (int j = num; j < num+3; j++) {
                v[i][j] = 2;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                w[i][j] = 2;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                for (int k = i; k < 3+i; k++) {
                    for (int l = j; l < 3+j; l++) {
                        if (v[k][l]==w[k-i][l-j]) {
                            n++;
                        }
                    }
                }
                if (n == 9) {
                    System.out.println("esta en la fila "+i+" columna "+j+" asta fila "+(i+2)+" columna "+(j+2));
                }
                n = 0;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i);
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(v[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.print("- ");
            for (int j = 0; j < 3; j++) {
                System.out.print(w[i][j]+" - ");
            }
            System.out.println("");
        }
    }
    
}
