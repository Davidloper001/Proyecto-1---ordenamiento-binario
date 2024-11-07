
package javaapplication2;

public class JavaApplication2 {

    public static void main(String[] args) {
        
        int A [] = {17,19,20,26,50,79,85,110,111,500,567,600};
        int pos = BusquedaBinaria(A,111);
        
        if(pos==-1){
            System.out.println("El dato no esta en el arreglo");
        }else{
            System.out.println("El dato no se encuentra en la posicion: "+pos);
        }
    }

    public static int BusquedaBinaria(int [] A, int dato){
        int inicio,fin,mitad;
        inicio = 0;
        fin = A.length - 1;

        while(inicio<fin){
            mitad = (inicio+fin)/2;
            if(A[mitad]==dato){
                return mitad;
            }else if(A[mitad]<dato){
                inicio = mitad+1;
            }else{
                fin = mitad-1;
            }
                
        }
        return 0;
        
    }
    
}
